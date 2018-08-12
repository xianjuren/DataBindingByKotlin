package com.databindingtest.attribute

import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.databinding.DataBindingUtil.setDefaultComponent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.databindingtest.R
import com.databindingtest.UrlUtil
import com.databindingtest.databinding.ActivityAttributeBinding

class AttributeSetterActivity : AppCompatActivity() {

    val clickListener = View.OnClickListener {
        Toast.makeText(this, "准备切换图片", Toast.LENGTH_SHORT).show()
        val attributeBinding = DataBindingUtil.setContentView<ActivityAttributeBinding>(this, R.layout.activity_attribute)
        attributeBinding.activity = this
        attributeBinding.imageUrl = UrlUtil.nextImgUrl()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  attributeBinding = DataBindingUtil.setContentView<ActivityAttributeBinding>(this,R.layout.activity_attribute)
        attributeBinding.activity = this
        attributeBinding.imageUrl = UrlUtil.nextImgUrl()
    }



    companion object {
        @BindingAdapter("imageUrl", "error")
        @JvmStatic
        fun setImageUrl(view: ImageView, url: String, error: Drawable) {
            Glide.with(view.context).load(url).apply(RequestOptions().error(error)).into(view)
        }
    }

}