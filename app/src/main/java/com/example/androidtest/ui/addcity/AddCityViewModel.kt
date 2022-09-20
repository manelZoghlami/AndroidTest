package com.example.androidtest.ui.addcity

import androidx.lifecycle.ViewModel
import com.example.androidtest.ui.addcity.model.CityUI
import com.example.androidtest.ui.addcity.model.mapping.toCity
import com.example.domainlayer.useCase.SaveCityUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddCityViewModel(
     private var saveCityUseCase: SaveCityUseCase
) : ViewModel() {
      fun addCity(cityUI: CityUI) {
          CoroutineScope(Dispatchers.IO).launch {
              saveCityUseCase.invoke(cityUI.toCity())
          }
     }
}