package com.arjental.daggertest

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class RepositiryModule {

    @Binds
    abstract fun provideRepository(repository: Repository): RepositoryInterface

    @Binds
    abstract fun provideNewRepository(newRepository: NewRepository): NewReposotoryInterface

    @Binds
    abstract fun provideDatabase(database: Database): DatabaseInterface

}