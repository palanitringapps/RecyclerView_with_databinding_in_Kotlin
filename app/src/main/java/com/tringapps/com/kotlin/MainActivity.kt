package com.tringapps.com.kotlin

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Button

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var tes = findViewById<Button>(R.id.jhfhj)
        tes.setOnClickListener({ a -> displayToast("sample ") })

        var rc = findViewById<RecyclerView>(R.id.recyclerView)
        rc.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val users = ArrayList<User>()
        users.add(User("Belal Khan", "Ranchi Jharkhand", 1,"https://homepages.cae.wisc.edu/~ece533/images/peppers.png"))
        users.add(User("Ramiz Khan", "Ranchi Jharkhand", 1,"https://homepages.cae.wisc.edu/~ece533/images/airplane.png"))
        users.add(User("Faiz Khan", "Ranchi Jharkhand", 2,"https://homepages.cae.wisc.edu/~ece533/images/boat.png"))
        users.add(User("Yashar Khan", "Ranchi Jharkhand", 2,"https://homepages.cae.wisc.edu/~ece533/images/monarch.png"))
        var adapter = CustomAdapter(users)
        rc.adapter = adapter

        var test = Test()
        test.test()
    }

}