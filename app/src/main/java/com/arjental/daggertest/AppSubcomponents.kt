package com.arjental.daggertest

import dagger.Module

@Module(subcomponents = [RegistrationComponent::class/*, LoginComponent::class, UserComponent::class*/])
class AppSubcomponents {
}