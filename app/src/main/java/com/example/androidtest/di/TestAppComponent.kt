package com.example.androidtest.di

import com.example.androidtest.di.modules.*
import com.example.androidtest.di.modules.DataBaseModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, UseCaseModule::class,
    RepositoriesModule::class, DataBaseModule::class, ViewModelModule::class, NetworkModule::class])
interface TestAppComponent :AppComponent