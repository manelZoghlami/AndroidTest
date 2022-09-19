package com.example.androidtest.ui.weatherCity

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.example.androidtest.databinding.FragmentWeatherCityBinding

class WeatherCityView(private val binding: FragmentWeatherCityBinding,
                      viewModel: WeatherCityViewModel,
                      owner: LifecycleOwner) {
    init {
     viewModel.getWeatherCity(48.856614, 2.3522219)
        viewModel.state.observe(owner, Observer { list ->
            showWeatherList(list)
        })
    }

    private fun showWeatherList(list: List<WeatherCityUI>?) {
        binding.main.text = list?.first()?.main?: ""
    }
}