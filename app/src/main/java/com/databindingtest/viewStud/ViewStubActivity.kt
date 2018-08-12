package com.databindingtest.viewStud

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.databindingtest.R
import com.databindingtest.databinding.ActivityViewStubBinding
import com.databindingtest.databinding.ViewStudOneLayoutBinding
import com.databindingtest.include.NormalUser
import kotlinx.android.synthetic.main.activity_view_stub.*

class ViewStubActivity : AppCompatActivity() {


    var user = NormalUser("向来缘浅", "奈何情深")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewStubBinding = DataBindingUtil.setContentView<ActivityViewStubBinding>(this, R.layout.activity_view_stub)
        view_stud_one.setOnInflateListener { stub, inflated ->
            val oneLayoutBinding = DataBindingUtil.bind<ViewStudOneLayoutBinding>(inflated)
            oneLayoutBinding?.user = user
        }

        view_stud_two.setOnInflateListener { stub, inflated ->
            val oneLayoutBinding = DataBindingUtil.bind<ViewStudOneLayoutBinding>(inflated)
            user.firstName = "青青子吟"
            user.lastName = "悠悠我心"
            oneLayoutBinding?.user = user
        }

    }

    fun checkViewStub(v: View) {
        if (null != view_stud_one && !view_stud_one.isInLayout) {
            view_stud_one.inflate()
        } else {
            if (null != view_stud_two && !view_stud_two.isInLayout) {
                view_stud_two.inflate()
            }
        }
    }
}