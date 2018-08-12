package com.databindingtest.custom

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.databindingtest.AllPathDataBinding
import com.databindingtest.DiffDataBinding
import com.databindingtest.R
import com.databindingtest.databinding.CustomDataBinding


/**
 * 说明参照DataBindingJava
 */
class CustomActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val user = CustomUser()
        //firstValue(user)
        // secondValue(user)
        threeValue(user)
    }

    private fun threeValue(user: CustomUser) {
        val allPathDataBinding = DataBindingUtil.setContentView<AllPathDataBinding>(this, R.layout.activity_all_path_rest)
        user.firstName = "事不过三"
        user.lastName = "全路径"
        allPathDataBinding.user = user
    }

    private fun secondValue(user: CustomUser) {
        val diffDataBinding = DataBindingUtil.setContentView<DiffDataBinding>(this, R.layout.activity_custom_diff)
        user.firstName = "一点一世界"
        user.lastName = "命名随意"
        diffDataBinding.user = user
    }

    private fun firstValue(user: CustomUser) {
        val customBinding = DataBindingUtil.setContentView<CustomDataBinding>(this, R.layout.activity_custom_class_data)
        user.firstName = "在我的世界"
        user.lastName = "肆无忌待的鼓励"
        customBinding.user = user
    }
}