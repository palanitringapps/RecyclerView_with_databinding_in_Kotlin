package com.tringapps.com.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast


open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}

fun BaseActivity.displayToast(msg : String) {
    Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
}