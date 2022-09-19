package com.example.androidtest.di.modules

import com.example.dataLayer.city.CityDao
import com.example.dataLayer.city.repository.CityRepositoryImpl
import com.example.dataLayer.weather.repository.WeatherCityRepositoryImpl
import com.example.dataLayer.weather.repository.api.WeatherApi
import com.example.domainlayer.repository.CityRepository
import com.example.domainlayer.repository.WeatherCityRepository
import dagger.Module
import dagger.Provides

@Module
class RepositoriesModule {
    @Provides
    fun provideCityRepository(dao: CityDao): CityRepository{
        return CityRepositoryImpl(dao)
    }

    @Provides
    fun provideWeatherCityRepository(api: WeatherApi): WeatherCityRepository {
        return WeatherCityRepositoryImpl(api)
    }
}