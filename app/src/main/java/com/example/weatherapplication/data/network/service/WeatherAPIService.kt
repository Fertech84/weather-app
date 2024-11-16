package com.example.weatherapplication.data.network.service

import retrofit2.http.GET
import retrofit2.http.Path


//https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid={API key}
const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
const val latitude = 2.5
const val longitude = 10.4
const val APIKey  = "dcaabf2e50584c5ffd873e737cc61311"

interface WeatherAPIService {

    @GET("weather?")
    fun getCurrentWeather()
}