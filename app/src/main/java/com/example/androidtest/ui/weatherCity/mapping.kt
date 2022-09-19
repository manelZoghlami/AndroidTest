package com.example.androidtest.ui.weatherCity

import com.example.androidtest.R
import com.example.domainlayer.models.WeatherCity

internal fun WeatherCity.toUi() = WeatherCityUI(main = main, description = description, iconResId = icon.toIcon())
fun String.toIcon() = when {
    this == "01d" -> R.drawable.d
    this == "01n" -> R.drawable.n
    this == "02n" -> R.drawable.se_n
    this == "02d" -> R.drawable.se_d
    this == "03n" -> R.drawable.th_n
    this == "03d" -> R.drawable.th_n
    this == "04n" -> R.drawable.f_n
    this == "04d" -> R.drawable.f_d
    this == "09n" -> R.drawable.n_n
    this == "09d" -> R.drawable.n_d
    this == "10n" -> R.drawable.t_n
    this == "10d" -> R.drawable.t_d
    this == "11n" -> R.drawable.el_n
    this == "11d" -> R.drawable.el_n
    this == "13n" -> R.drawable.thi_n
    this == "13d" -> R.drawable.thi_d
    this == "50n" -> R.drawable.thi_n
    this == "50d" -> R.drawable.thi_d
    else -> R.drawable.no_icon
}