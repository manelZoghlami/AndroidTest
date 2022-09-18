package com.example.dataLayer.city.repository

import com.example.dataLayer.city.CityDao
import com.example.dataLayer.city.models.toCity
import com.example.dataLayer.city.models.toEntity
import com.example.domainlayer.models.City
import com.example.domainlayer.repository.CityRepository


class CityRepositoryImpl(
    private val cityDao: CityDao
) : CityRepository {

    override suspend fun saveCity(cityModel: City) {
        cityDao.insertCity(cityModel.toEntity())
    }

    override suspend fun getAllCity(): List<City> {
        return cityDao.gelAllCity().map { it.toCity()}
       return emptyList()
    }
}