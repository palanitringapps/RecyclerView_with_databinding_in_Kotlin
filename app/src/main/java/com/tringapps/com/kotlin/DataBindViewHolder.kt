package com.tringapps.com.kotlin

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView


class DataBindViewHolder(val bind: ViewDataBinding) : RecyclerView.ViewHolder(bind.root) {
    fun bind(data: Any) {
        bind.setVariable(BR.user, data)
        bind.executePendingBindings()
    }
}