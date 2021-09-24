package com.arjental.daggertest.ui.main

import androidx.lifecycle.ViewModel
import com.arjental.daggertest.*
import javax.inject.Inject

class MainViewModel @Inject constructor(database: Database, repository: Repository, newRepository: NewRepository) : ViewModel() {



    val riba: TestObject = TestObject

    val f = database.databse

    val s = "MainViewModel"

    init {


        println("DAGGER OUT sinit ${repository.s}")
        println("DAGGER OUT sinit NR ${newRepository.s}")
    }

}