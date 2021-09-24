package com.arjental.daggertest

import javax.inject.Inject

interface RepositoryInterface {
    fun setString(key: String, value: String)
    fun getString(key: String): String
}