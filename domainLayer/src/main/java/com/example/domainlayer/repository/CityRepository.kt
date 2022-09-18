package com.example.domainlayer.repository

import com.example.domainlayer.models.City

interface CityRepository {
    suspend fun saveCity(cityModel: City)
    suspend fun getAllCity(): List<City>
}