package com.tringapps.com.kotlin

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast


open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!setupPermission()) {
            requestPermissions(arrayOf(Manifest.permission.CALL_PHONE), 111)
        }
    }

    fun setupPermission(): Boolean {
        val permission = ContextCompat.checkSelfPermission(this, Manifest.permission.INTERNET)
        if (permission != PackageManager.PERMISSION_GRANTED) {
            return false
        }
        return true
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (grantResults.isNotEmpty()) {
            if (requestCode == 111) {
                Log.i("sdcjhg", "sdmvbgranded")
            }
        }
    }

}

fun BaseActivity.displayToast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}