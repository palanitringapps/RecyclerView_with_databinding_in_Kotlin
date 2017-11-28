package com.tringapps.com.kotlin

/**
 * Created by tringapps-admin on 15/11/17.
 */
data class User(val name:String,val age:String,val id: Int)
data class SearchInfo(val count:Int)
data class Query(val searchInfo: SearchInfo)
data class Result(val query: Query)
