package com.example.dataLayer.weather.repository.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

const val TOKEN = "5765a9bd7c84ed0b0426f55582cd5f5c"
interface WeatherApi {
    @GET("/data/2.5/onecall")
    suspend fun getWeatherCity(@Query("lat") lat: Double, @Query("lng") long: Double, @Query("appid") token: String = TOKEN): Response<ResponseJson>
}