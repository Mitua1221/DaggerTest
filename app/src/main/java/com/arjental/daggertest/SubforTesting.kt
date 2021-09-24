package com.arjental.daggertest

import javax.inject.Inject

class SubforTesting @Inject constructor(): SubforTestingInterface {

    override val string: String = "SubforTesting"


}