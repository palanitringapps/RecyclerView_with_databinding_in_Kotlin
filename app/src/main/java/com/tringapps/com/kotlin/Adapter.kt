package com.tringapps.com.kotlin

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.tringapps.com.kotlin.databinding.AdapterBinding


class CustomAdapter(val list: ArrayList<User>) : RecyclerView.Adapter<DataBindViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataBindViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ViewDataBinding =
                DataBindingUtil.inflate(layoutInflater, R.layout.adapter, parent, false)
        val bind2: ViewDataBinding = DataBindingUtil.inflate(layoutInflater, R.layout.adapter1, parent, false)
        when {
            1 == viewType -> return DataBindViewHolder(binding)
            2 == viewType -> return DataBindViewHolder(bind2)

        }
        return DataBindViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DataBindViewHolder, position: Int) {
        
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].id
    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }
}