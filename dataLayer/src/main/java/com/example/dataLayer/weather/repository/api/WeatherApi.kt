package com.example.dataLayer.weather.repository.api

import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherApi {
    @GET("data/2.5/onecall")
    fun getWeatherCity(@Path("lat") lat: Double, @Path("lng") long: Double): ResponseJson
}