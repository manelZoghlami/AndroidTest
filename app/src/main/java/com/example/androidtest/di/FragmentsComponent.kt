package com.example.androidtest.di

import com.example.androidtest.ui.addcity.AddCityFragment
import com.example.androidtest.ui.city.CityListFragment
import dagger.Subcomponent

@Subcomponent
interface FragmentsComponent {
    fun inject(fragment: AddCityFragment)
    fun inject(fragmentCity: CityListFragment)
}