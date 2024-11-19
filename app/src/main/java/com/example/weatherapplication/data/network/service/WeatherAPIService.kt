package com.example.weatherapplication.data.network.service

import com.example.weatherapplication.data.dto.WeatherInDTO
import retrofit2.http.GET
import retrofit2.http.Query


//https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid={API key}

const val APIKey  = "dcaabf2e50584c5ffd873e737cc61311"

interface WeatherAPIService {

    @GET("weather")
    fun getCurrentWeather(
        @Query("lat") latitude : Float,
        @Query("lon") longitude : Float,
        @Query("appid")  apiKey: String = APIKey) : WeatherInDTO

}