package com.example.androidtest.ui.city

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidtest.ui.addcity.model.CityUI
import com.example.androidtest.ui.city.mapping.toCityUI
import com.example.domainlayer.useCase.GetAllCityUseCase
import kotlinx.coroutines.*

class CityViewModel(private val getAllCityUseCase: GetAllCityUseCase) : ViewModel() {

    private val cityList = MutableLiveData<List<CityUI>>()
    val state: LiveData<List<CityUI>> = cityList

    init {
        getAllCity()
    }

    private fun getAllCity() {
        CoroutineScope(Dispatchers.IO).launch {
            val list = getAllCityUseCase.invoke()
            withContext(Dispatchers.Main){
                cityList.value = list.map { it.toCityUI() }

            }
        }
    }
}