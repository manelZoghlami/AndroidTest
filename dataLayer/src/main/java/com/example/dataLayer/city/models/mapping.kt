package com.example.dataLayer.city.models

import com.example.domainlayer.models.City

internal fun City.toEntity() = CityEntity(cityName = cityName, lat = lat, lng = lng)
internal fun CityEntity.toCity() = City(cityName = cityName, lat = lat, lng = lng)