package com.databindingtest.observable

import android.databinding.DataBindingUtil
import android.databinding.ObservableArrayList
import android.databinding.ObservableArrayMap
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.databindingtest.R
import com.databindingtest.databinding.ActivityObservableBinding

class ObservableActivity : AppCompatActivity() {

    var user = ObservableFileUser()
    var obserUser = ObservableUser()
    var mapUser = ObservableArrayMap<String, Any>()
    var listUser = ObservableArrayList<Any>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityObservableBinding>(this, R.layout.activity_observable)
        binding.user = user
        binding.obserUser = obserUser
        binding.listUser = listUser
        binding.mapUser = mapUser
    }

    //button的onClick方法
    fun initValue(v: View) {
        user.firstName.set("一语花香")
        user.lastName.set("无语凝噎")
        user.age.set(66)

        obserUser.firstName = "芍药"
        obserUser.lastName = "牡丹"

        mapUser.apply {
            put("firstName", "孙悟空")
            put("lastName", "猪八戒")
            put("age", 10000)
        }
        listUser.clear()
        listUser.apply {
            add("郭德纲")
            add("郭麒麟")
            add(43)
        }

    }

    fun resetValue(v: View) {
        user.firstName.set("遥看瀑布挂前川")
        user.lastName.set("疑是银河落九天")
        user.age.set(48)

        obserUser.firstName = "菊花"
        obserUser.lastName = "郁金香"

        mapUser.apply {
            put("firstName", "林黛玉")
            put("lastName", "贾宝玉")
            put("age", 666)
        }
        listUser.clear()
        listUser.apply {
            add("岳云鹏")
            add("孙悦")
            add(33)
        }
    }

}