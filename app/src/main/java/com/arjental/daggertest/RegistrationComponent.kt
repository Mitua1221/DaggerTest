package com.arjental.daggertest

import com.arjental.daggertest.ui.main.MainFragment
import dagger.Subcomponent

@Subcomponent
interface RegistrationComponent {

    @Subcomponent.Factory
    interface Factory {

        fun create(): RegistrationComponent

    }

    fun inject(fragment: MainFragment)
    fun inject(subforTesting: SubforTesting)

}