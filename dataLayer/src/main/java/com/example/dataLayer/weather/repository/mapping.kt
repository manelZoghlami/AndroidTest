package com.example.dataLayer.weather.repository

import com.example.dataLayer.weather.repository.api.WeatherJson
import com.example.domainlayer.models.WeatherCity

internal fun WeatherJson.toWeatherCity() = WeatherCity(main = main, description= description, icon= icon)