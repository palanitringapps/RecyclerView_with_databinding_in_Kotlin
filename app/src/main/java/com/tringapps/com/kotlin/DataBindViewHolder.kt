package com.tringapps.com.kotlin

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tringapps.com.kotlin.databinding.AdapterBinding


class DataBindViewHolder(private val bind: ViewDataBinding) : RecyclerView.ViewHolder(bind.root) {
    private lateinit var binder: AdapterBinding
    fun bind(data: Any) {
        bind.setVariable(BR.user, data)
        if (data is User) {
            if (bind is AdapterBinding) {
                binder = bind
                Glide.with(binder.root).load(data.path).into(binder.image)
            }
        }
        bind.executePendingBindings()
    }
}