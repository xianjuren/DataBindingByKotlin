package com.databindingtest.resource

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.databindingtest.R
import com.databindingtest.databinding.ActivityResourceBinding

class ResourceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val resourceBinding = DataBindingUtil.setContentView<ActivityResourceBinding>(this, R.layout.activity_resource)
        resourceBinding.firstName = "千里之外"
        resourceBinding.lastName = "洛神赋"
        resourceBinding.large = false
        resourceBinding.bCount = 5258
        resourceBinding.oCount = 1248

    }


}