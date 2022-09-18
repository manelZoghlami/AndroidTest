package com.example.androidtest.ui.addcity.model.mapping

import com.example.androidtest.ui.addcity.model.CityUI
import com.example.domainlayer.models.City

internal fun CityUI.toCity()= City(cityName = city,lat= lat, lng= lng)