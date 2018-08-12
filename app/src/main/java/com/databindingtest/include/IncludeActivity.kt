package com.databindingtest.include

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import com.databindingtest.R
import com.databindingtest.databinding.ActivityIncludeBinding
import com.databindingtest.listener.OnChoiceClick
import kotlinx.android.synthetic.main.input_layout.*

class IncludeActivity : AppCompatActivity(), OnChoiceClick {


    override fun choiceClick(view: View) {
        Toast.makeText(this, "已经点击", Toast.LENGTH_SHORT).show()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val includeBinding = DataBindingUtil.setContentView<ActivityIncludeBinding>(this, R.layout.activity_include)
        includeBinding.listener = this
        includeBinding.okText = "花落知多少"
        includeBinding.user = NormalUser("你的追求", "我的温柔")
        // includeBinding.inputLayout.editInput.addTextChangedListener(this)
        edit_input.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                includeBinding.user = NormalUser("你的追求", s.toString())
            }
        })

    }


}




