package com.example.dataLayer.weather.repository

import com.example.dataLayer.weather.repository.api.WeatherApi
import com.example.domainlayer.models.CurrentWeather
import com.example.domainlayer.models.WeatherCity
import com.example.domainlayer.repository.WeatherCityRepository


class WeatherCityRepositoryImpl(
    private val weatherApi: WeatherApi
) : WeatherCityRepository {
    override suspend fun getWeatherCity(cityName: String): CurrentWeather {
        return weatherApi.getWeatherCity(cityName)
            .body()?.toCurrentWeather() ?:
            CurrentWeather("", 0.0, WeatherCity("","", ""))
    }
}