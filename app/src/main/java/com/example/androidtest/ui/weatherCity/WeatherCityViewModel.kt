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

    private val list = MutableLiveData<CurrentWeatherUI>()
    val state: LiveData<CurrentWeatherUI> = list

    fun getWeatherCity(cityName: String) {
        CoroutineScope(Dispatchers.IO).launch {
           val response = weatherCityUseCase.invoke(cityName)
            withContext(Dispatchers.Main) {
            list.value = response.toCurrentWeatherUI()
            }
        }
    }
}