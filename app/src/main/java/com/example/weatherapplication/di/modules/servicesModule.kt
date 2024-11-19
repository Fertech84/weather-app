package com.example.weatherapplication.di.modules

import com.example.weatherapplication.data.network.service.WeatherAPIService
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object ServiceProvider{

    fun provideWeatherService(retrofit : Retrofit) : WeatherAPIService{
        return retrofit.create(WeatherAPIService::class.java)
    }
}