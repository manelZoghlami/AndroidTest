package com.example.androidtest.di.modules

import android.app.Application
import android.content.Context
import com.example.androidtest.TestApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule (private val application: TestApp) {

    @Singleton
    @Provides
    fun provideContext(): Context {
        return application
    }

    @Singleton
    @Provides
    fun provideApplicationContext(): Application {
        return application
    }
}