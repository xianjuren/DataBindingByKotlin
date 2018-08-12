package com.databindingtest.recycler

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.databindingtest.R
import com.databindingtest.databinding.ActivityRecyclerBinding
import com.databindingtest.include.NormalUser
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityRecyclerBinding>(this, R.layout.activity_recycler)
        recycler_view.layoutManager = LinearLayoutManager(this)
        val adapter = UserKotlinAdapter()
        recycler_view.adapter = adapter
        val list = ArrayList<NormalUser>()
        for (i in 1..4) {
            val user = NormalUser("北京第" + (i + 1) + "胡同", "北京西城")
            list.add(user)
        }
        adapter.setData(list)
    }


}