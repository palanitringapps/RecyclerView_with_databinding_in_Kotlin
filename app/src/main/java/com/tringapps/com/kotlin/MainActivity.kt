package com.tringapps.com.kotlin

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var teat = findViewById(R.id.jhfhj) as Button
        //teat.setOnClickListener({ a-> })

        var tes = findViewById<Button>(R.id.jhfhj)
        tes.setOnClickListener({ a -> displayToast("sample ") })
        //displayToast("jfgjjkl;dshmjk")
        var rc = findViewById<RecyclerView>(R.id.recyclerView)
        rc.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //crating an arraylist to store users using the data class user
        val users = ArrayList<User>()

        //adding some dummy data to the list
        users.add(User("Belal Khan", "Ranchi Jharkhand", 1))
        users.add(User("Ramiz Khan", "Ranchi Jharkhand", 1))
        users.add(User("Faiz Khan", "Ranchi Jharkhand", 2))
        users.add(User("Yashar Khan", "Ranchi Jharkhand", 2))
        var adapter = CustomAdapter(users)
        rc.adapter = adapter
    }
}