package com.databindingtest.viewId

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import com.databindingtest.R
import com.databindingtest.databinding.ActivityViewIdBinding
import com.databindingtest.include.NormalUser
import kotlinx.android.synthetic.main.input_layout.*

class ViewIdActivity : AppCompatActivity() {

    var user = NormalUser("开始", "结束")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewIdBinding = DataBindingUtil.setContentView<ActivityViewIdBinding>(this, R.layout.activity_view_id)
        viewIdBinding.user = user
        edit_input.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                user.lastName = s.toString()
                viewIdBinding.user = user
            }
        })
    }
}