package com.example.domainlayer.repository

import com.example.domainlayer.models.CurrentWeather

interface WeatherCityRepository {
    suspend fun getWeatherCity(cityName: String): CurrentWeather
}