package com.example.dataLayer.weather.repository.api

import com.google.gson.annotations.SerializedName

data class ResponseJson(@SerializedName("current") val currentJson: CurrentJson)
data class CurrentJson(@SerializedName("weather") val weatherJson: List<WeatherJson>)
data class WeatherJson(val main: String, val description: String, val icon: String)