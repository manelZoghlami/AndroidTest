package com.example.androidtest.di

interface AppComponent {
    fun activitiesComponent(): ActivitiesComponent
    fun fragmentsComponent(): FragmentsComponent
}