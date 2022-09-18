package com.example.androidtest

import android.app.Application
import com.example.androidtest.di.ActivitiesComponent
import com.example.androidtest.di.AppComponent
import com.example.androidtest.di.DaggerTestAppComponent
import com.example.androidtest.di.FragmentsComponent
import com.example.androidtest.di.modules.AppModule

class TestApp: Application(), AppComponent {
    lateinit var appComponent: AppComponent
    init {
        initDagger()
    }
    private fun initDagger(){
        appComponent = DaggerTestAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }
    override fun activitiesComponent(): ActivitiesComponent = appComponent.activitiesComponent()

    override fun fragmentsComponent(): FragmentsComponent = appComponent.fragmentsComponent()

}