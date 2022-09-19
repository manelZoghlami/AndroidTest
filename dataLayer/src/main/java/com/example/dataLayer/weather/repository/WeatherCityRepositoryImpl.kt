package com.example.dataLayer.weather.repository

import com.example.dataLayer.weather.repository.api.WeatherApi
import com.example.domainlayer.models.WeatherCity
import com.example.domainlayer.repository.WeatherCityRepository


class WeatherCityRepositoryImpl(
    private val weatherApi: WeatherApi
) : WeatherCityRepository {

    override suspend fun getWeatherCity(lat: Double, lng: Double): List<WeatherCity> {
        val response = weatherApi.getWeatherCity(lat, lng)
        return response.body()?.currentJson?.weatherJson?.map { it.toWeatherCity() } ?: emptyList()
    }
}