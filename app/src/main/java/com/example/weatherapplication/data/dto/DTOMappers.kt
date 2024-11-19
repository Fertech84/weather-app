package com.example.weatherapplication.data.dto

import com.example.weatherapplication.domain.model.Coord
import com.example.weatherapplication.domain.model.MainWeatherInfo
import com.example.weatherapplication.domain.model.Weather
import com.example.weatherapplication.domain.model.WeatherData
import com.example.weatherapplication.domain.model.WeatherWind

fun CoordDTO.toCoord() : Coord{
    return Coord(
        longitude = this.longitude,
        latitude = this.latitude
    )
}

fun WeatherDTO.toWeather() : Weather{
    return Weather(
        id = this.id,
        weather = this.weather,
        detailedWeather = this.detailedWeather,
        icon = this.icon
    )
}

fun MainWeatherInfoDTO.toMainWeatherInfo(): MainWeatherInfo{
    return MainWeatherInfo(
        temperature = this.temperature,
        temperatureSensation = this.temperatureSensation,
        minTemperature = this.minTemperature,
        maxTemperature = this.maxTemperature,
        pressure = this.pressure,
        humidity = this.humidity,
        seaLevel = this.seaLevel,
        groundLevel = this.groundLevel
    )
}

fun WeatherWindDTO.toWeatherWind() : WeatherWind{
    return WeatherWind(
        speed = this.speed,
        degrees = this.degrees,
        gust = this.gust
    )
}

fun WeatherInDTO.toWeatherData() : WeatherData{
    return WeatherData(
        coordinates = this.coordinates.toCoord(),
        weather = this.weather.map { it.toWeather() },
        base = this.base,
        mainInfo =  this.mainInfo.toMainWeatherInfo(),
        visibility = this.visibility,
        wind = this.wind.toWeatherWind()
    )
}



