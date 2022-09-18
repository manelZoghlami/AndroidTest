package com.example.domainlayer.repository

import com.example.domainlayer.models.WeatherCity

interface WeatherCityRepository {
    suspend fun getWeatherCity(lat: Double, lng: Double): List<WeatherCity>
}