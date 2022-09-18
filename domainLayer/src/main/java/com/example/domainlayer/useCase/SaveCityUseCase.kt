package com.example.domainlayer.useCase

import com.example.domainlayer.models.City
import com.example.domainlayer.repository.CityRepository

class SaveCityUseCase (private val cityRepository: CityRepository) {
    suspend operator fun invoke(cityModel: City) = cityRepository.saveCity(cityModel)
}
