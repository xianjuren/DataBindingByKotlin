package com.databindingtest

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.databindingtest.databinding.ActivityBasicBinding


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val databing: ActivityBasicBinding = DataBindingUtil.setContentView(this, R.layout.activity_basic)
        databing.user = User("第一种形式", "张华", 29)
    }
}