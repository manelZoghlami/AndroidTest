package com.example.androidtest.ui.weatherCity
data class CurrentWeatherUI(val name: String, val temp: Double, val weatherCityUI: WeatherCityUI)
data class WeatherCityUI(val main: String, val description: String, val iconResId: Int)