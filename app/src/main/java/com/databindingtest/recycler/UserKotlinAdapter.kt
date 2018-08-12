package com.databindingtest.recycler

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.databindingtest.R
import com.databindingtest.databinding.UserItemBinding
import com.databindingtest.include.NormalUser


class UserKotlinAdapter : RecyclerView.Adapter<UserKotlinAdapter.UserKotlinHolder>() {

    private var userList = ArrayList<NormalUser>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserKotlinHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)
        return UserKotlinHolder(view)
    }

    override fun getItemCount(): Int = userList.size

    override fun onBindViewHolder(holder: UserKotlinHolder, position: Int) {
        holder.bind(userList[position])
    }

    fun setData(data: ArrayList<NormalUser>) {
        userList = data
        notifyDataSetChanged()
    }


    class UserKotlinHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(customUser: NormalUser) {
            val itemBinding = DataBindingUtil.bind<UserItemBinding>(view)
            itemBinding?.user = customUser
            view.setOnClickListener {
                Toast.makeText(view.context, customUser.firstName, Toast.LENGTH_SHORT).show()
            }
        }

    }


}