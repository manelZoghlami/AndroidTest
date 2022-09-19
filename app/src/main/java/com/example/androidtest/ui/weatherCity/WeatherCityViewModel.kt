package com.example.androidtest.ui.weatherCity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.androidtest.ui.addcity.model.CityUI
import com.example.domainlayer.useCase.WeatherCityUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class WeatherCityViewModel(private val weatherCityUseCase: WeatherCityUseCase) {

    private val list = MutableLiveData<List<WeatherCityUI>>()
    val state: LiveData<List<WeatherCityUI>> = list

    fun getWeatherCity(lat: Double, lng: Double) {
        CoroutineScope(Dispatchers.IO).launch {
           val response = weatherCityUseCase.invoke(lat, lng)
            withContext(Dispatchers.Main) {
            list.value = response.map { it.toUi() }
            }
        }
    }
}