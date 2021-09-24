package com.arjental.daggertest

import android.content.Context
import javax.inject.Inject

class Database @Inject constructor(context: Context, repository: Repository): DatabaseInterface {

    override val databse = "DATA ORACLE"

}