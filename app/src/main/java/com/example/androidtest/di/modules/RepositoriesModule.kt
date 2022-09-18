package com.example.androidtest.di.modules

import com.example.dataLayer.city.CityDao
import com.example.dataLayer.city.repository.CityRepositoryImpl
import com.example.domainlayer.repository.CityRepository
import dagger.Module
import dagger.Provides

@Module
class RepositoriesModule {
    @Provides
    fun provideCityRepository(dao: CityDao): CityRepository{
        return CityRepositoryImpl(dao)
    }
}