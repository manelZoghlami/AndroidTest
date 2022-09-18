package com.example.domainlayer.useCase

import com.example.domainlayer.models.City
import com.example.domainlayer.models.WeatherCity
import com.example.domainlayer.repository.CityRepository
import com.example.domainlayer.repository.WeatherCityRepository

class WeatherCityUseCase (private val weatherCityRepository: WeatherCityRepository) {
    suspend operator fun invoke(lat: Double, lng: Double) = weatherCityRepository.getWeatherCity(lat,lng)
}
