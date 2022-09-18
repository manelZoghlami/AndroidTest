package com.example.domainlayer.useCase

import com.example.domainlayer.repository.CityRepository

class GetAllCityUseCase (private val cityRepository: CityRepository) {
    suspend operator fun invoke() = cityRepository.getAllCity()
}