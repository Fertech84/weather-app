package com.example.weatherapplication.domain.useCases

import com.example.weatherapplication.data.dto.toWeatherData
import com.example.weatherapplication.data.network.service.WeatherAPIService
import com.example.weatherapplication.domain.model.WeatherData

interface WeatherUseCases {
    suspend fun getCurrentWeather(latitude: Float, longitude: Float): WeatherData
}

class WeatherUseCasesImpl(private val weatherAPIService: WeatherAPIService) : WeatherUseCases {
    override suspend fun getCurrentWeather(latitude: Float, longitude: Float): WeatherData {
         return weatherAPIService.getCurrentWeather(
                latitude = latitude,
                longitude = longitude
            ).toWeatherData()
    }

}