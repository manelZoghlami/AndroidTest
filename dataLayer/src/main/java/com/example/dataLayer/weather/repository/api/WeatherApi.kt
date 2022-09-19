package com.example.dataLayer.weather.repository.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

const val TOKEN = "5765a9bd7c84ed0b0426f55582cd5f5c"
const val LANG = "fr"
const val UNITS = "metric"
interface WeatherApi {
    @GET("/data/2.5/weather")
    suspend fun getWeatherCity(@Query("q") q: String,
                               @Query("units") long: String = UNITS,
                               @Query("lang") lang: String = LANG,
                               @Query("appid") token: String = TOKEN): Response<CurrentWeatherJson>
}