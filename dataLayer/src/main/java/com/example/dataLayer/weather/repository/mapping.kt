package com.example.dataLayer.weather.repository

import com.example.dataLayer.weather.repository.api.CurrentWeatherJson
import com.example.dataLayer.weather.repository.api.WeatherJson
import com.example.domainlayer.models.CurrentWeather
import com.example.domainlayer.models.WeatherCity
internal fun CurrentWeatherJson.toCurrentWeather() = CurrentWeather(name = name,
                                                                    temp = mainJson.temp,
                                                                    weatherCity = weatherJson.first().toWeatherCity())
internal fun WeatherJson.toWeatherCity() = WeatherCity(main = main, description= description, icon= icon)