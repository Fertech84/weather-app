package com.example.weatherapplication.di.modules

import com.example.weatherapplication.data.network.service.WeatherAPIService
import com.example.weatherapplication.domain.useCases.WeatherUseCases
import com.example.weatherapplication.domain.useCases.WeatherUseCasesImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object WeatherUseCaseProvider{

    @Provides
    fun provideWeatherUseCases(weatherAPIService : WeatherAPIService): WeatherUseCases{
        return WeatherUseCasesImpl(weatherAPIService)
    }
}