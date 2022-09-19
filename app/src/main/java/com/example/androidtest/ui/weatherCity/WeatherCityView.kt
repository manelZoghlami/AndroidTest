package com.example.androidtest.ui.weatherCity

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.example.androidtest.databinding.FragmentWeatherCityBinding
import java.util.*

class WeatherCityView(private val binding: FragmentWeatherCityBinding,
                      name: String,
                      viewModel: WeatherCityViewModel,
                      owner: LifecycleOwner) {
    init {
     viewModel.getWeatherCity(name)
        viewModel.state.observe(owner, Observer { list ->
            showWeatherList(list)
        })
    }

    private fun showWeatherList(currentWeatherUI: CurrentWeatherUI) {
        binding.cityName.text = currentWeatherUI.name
        binding.tempTextView.text = String.format(Locale.getDefault(), "%.0f°", currentWeatherUI.temp)
        binding.descriptionTextView.text = currentWeatherUI.weatherCityUI.description
        binding.icon.setImageResource(currentWeatherUI.weatherCityUI.iconResId)
    }
}