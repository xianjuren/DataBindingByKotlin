package com.databindingtest.basic

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.databindingtest.R
import com.databindingtest.User
import com.databindingtest.databinding.ActivityBasicBinding

class BasicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBing = DataBindingUtil.setContentView<ActivityBasicBinding>(this, R.layout.activity_basic)
        dataBing.user = User("烟雨", "雾花", 66)
        // tv_last.text = "雾里看花"
    }
}