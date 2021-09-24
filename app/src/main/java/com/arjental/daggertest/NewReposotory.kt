package com.arjental.daggertest

import android.content.Context
import javax.inject.Inject
import javax.inject.Singleton

interface NewReposotoryInterface

@Singleton
class NewRepository @Inject constructor(context: Context): NewReposotoryInterface {

    val s = 335

    init {
        println("DAGGER OUT NewRepository Inited")
    }

    fun setString(key: String, value: String) {
    }

    fun getString(key: String): String {
        return "Null"
    }

    fun getKey(): String {
        return "key"
    }

}