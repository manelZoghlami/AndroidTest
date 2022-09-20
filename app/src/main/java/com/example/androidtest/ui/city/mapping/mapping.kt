package com.example.androidtest.ui.city.mapping

import com.example.androidtest.ui.addcity.model.CityUI
import com.example.domainlayer.models.City

internal fun City.toCityUI()= CityUI(city = cityName)