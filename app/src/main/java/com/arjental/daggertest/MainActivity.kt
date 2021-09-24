package com.arjental.daggertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arjental.daggertest.ui.main.MainFragment
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var repository: Repository

    @Inject
    lateinit var newRepository: NewRepository

    override fun onCreate(savedInstanceState: Bundle?) {

        (application as DaggerTstApp).appComponent.inject(this)

        println("DAGGER OUT " + repository.s)

        println("DAGGER OUT " + repository.getKey())

        println("DAGGER OUT NR " + newRepository.s)

        println("DAGGER OUT NR " + newRepository.getKey())

        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}