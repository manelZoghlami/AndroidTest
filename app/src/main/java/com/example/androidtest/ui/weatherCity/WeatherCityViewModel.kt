package com.example.androidtest.ui.weatherCity

import androidx.lifecycle.LiveData
import com.example.androidtest.ui.addcity.model.CityUI
import com.example.androidtest.ui.city.mapping.toCityUI
import com.example.domainlayer.useCase.GetAllCityUseCase
import com.example.domainlayer.useCase.WeatherCityUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WeatherCityViewModel(private val weatherCityUseCase: WeatherCityUseCase) {

    fun getWeatherCity(lat: Double, lng: Double) {

        CoroutineScope(Dispatchers.IO).launch {
            weatherCityUseCase.invoke(lat, lng)

        }
    }
}