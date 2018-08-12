package com.databindingtest.collection

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.SparseArray
import com.databindingtest.R
import com.databindingtest.databinding.ActivityCollectionBinding
import java.util.ArrayList
import java.util.HashMap

class CollectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityCollectionBinding>(this, R.layout.activity_collection)
        val literals = arrayOf("追星", "追月")
        val lists = ArrayList<String>()
        val sparses = SparseArray<String>(2)
        val key = "firstName"
        val index = 0
        for (i in literals.indices) {
            lists.add(literals[i])
            sparses.put(0, literals[i])
        }
        val maps = HashMap<String, String>()
        maps[key] = "追星"
        maps["lastName"] = "追月"
        binding.index =index
        binding.key =key
        binding.list =lists
        binding.map =maps
        binding.sparse =sparses
    }
}