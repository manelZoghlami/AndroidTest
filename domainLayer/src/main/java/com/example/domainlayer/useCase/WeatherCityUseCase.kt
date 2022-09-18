package com.example.domainlayer.useCase

import com.example.domainlayer.repository.WeatherCityRepository

class WeatherCityUseCase (private val weatherCityRepository: WeatherCityRepository) {
    suspend operator fun invoke(lat: Double, lng: Double) = weatherCityRepository.getWeatherCity(lat,lng)
}
