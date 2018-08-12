package com.databindingtest.convert

import android.content.Context
import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.databinding.ObservableBoolean
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.databindingtest.R
import com.databindingtest.databinding.ActivityConvertBinding

class ConvertActivity : AppCompatActivity() {

    private val isError = ObservableBoolean()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val convertBinding = DataBindingUtil.setContentView<ActivityConvertBinding>(this, R.layout.activity_convert)
        isError.set(true)
        convertBinding.isError = isError
        convertBinding.height = dp2px(this, 300)
    }

    companion object {
        @BindingAdapter("layout_height")
        @JvmStatic
        fun setHeight(v: View, height: Int) {
            var params = v.layoutParams
            params.height = height
            v.layoutParams = params
        }
    }



    fun choiceToggle(v: View) {
        isError.set(!isError.get())
    }

    fun dp2px(context: Context, dpValue: Int): Int {
        return (dpValue * context.resources.displayMetrics.density).toInt()
    }
}