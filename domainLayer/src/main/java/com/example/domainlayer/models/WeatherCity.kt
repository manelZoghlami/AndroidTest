package com.example.domainlayer.models
data class CurrentWeather(val name: String, val temp: Double, val weatherCity: WeatherCity)
data class WeatherCity(val main: String, val description: String, val icon: String)