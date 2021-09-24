package com.arjental.daggertest

import android.content.Context
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(context: Context): RepositoryInterface {

    val s = 335

    init {
        println("Repository Inited")
    }

    override fun setString(key: String, value: String) {
    }

    override fun getString(key: String): String {
        return "Null"
    }

    fun getKey(): String {
        return "key"
    }

}