package com.databindingtest

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.databindingtest.attribute.AttributeSetterActivity
import com.databindingtest.basic.BasicActivity
import com.databindingtest.collection.CollectionActivity
import com.databindingtest.convert.ConvertActivity
import com.databindingtest.custom.CustomActivity
import com.databindingtest.include.IncludeActivity
import com.databindingtest.observable.ObservableActivity
import com.databindingtest.recycler.RecyclerActivity
import com.databindingtest.resource.ResourceActivity
import com.databindingtest.viewId.ViewIdActivity
import com.databindingtest.viewStud.ViewStubActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : Activity(), View.OnClickListener {

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_basic -> startActivity(Intent(this, BasicActivity::class.java))

        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        btn_basic.setOnClickListener(this)
        btn_include.setOnClickListener {
            startActivity(Intent(this, IncludeActivity::class.java))
        }
    }

    fun byKotlin(v: View) {
        startActivity(Intent(this, MainActivity::class.java))
    }

    fun customBinding(v: View) {
        startActivity(Intent(this, CustomActivity::class.java))
    }

    fun collection(v: View) {
        startActivity(Intent(this, CollectionActivity::class.java))
    }

    fun resource(v: View) {
        startActivity(Intent(this, ResourceActivity::class.java))
    }

    fun observable(v: View) {
        startActivity(Intent(this, ObservableActivity::class.java))
    }

    fun viewId(v: View) {
        startActivity(Intent(this, ViewIdActivity::class.java))
    }

    fun viewStub(v: View) {
        startActivity(Intent(this, ViewStubActivity::class.java))
    }

    fun recycler(v: View) {
        startActivity(Intent(this, RecyclerActivity::class.java))
    }

    fun attribute(v: View) {
        startActivity(Intent(this, AttributeSetterActivity::class.java))
    }

    fun convert(v: View) {
        startActivity(Intent(this, ConvertActivity::class.java))
    }

}