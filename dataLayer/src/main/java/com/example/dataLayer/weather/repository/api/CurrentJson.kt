package com.example.dataLayer.weather.repository.api

import com.google.gson.annotations.SerializedName

data class CurrentWeatherJson(val name: String,
                              @SerializedName("main") val mainJson: MainJson,
                              @SerializedName("weather") val weatherJson: List<WeatherJson>)
data class MainJson(val temp: Double)
data class WeatherJson(val main: String, val description: String, val icon: String)