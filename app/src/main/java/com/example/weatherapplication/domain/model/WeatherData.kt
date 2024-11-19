package com.example.weatherapplication.domain.model

data class WeatherData(

    val coordinates : Coord,

    val weather : List<Weather> ,

    val base : String,

    val mainInfo : MainWeatherInfo,

    val visibility : Float,

    val wind : WeatherWind,

    )



data class WeatherWind(
    val speed : Float,

    val degrees : Float,

    val gust : Float
)


data class MainWeatherInfo(
    val temperature : Float,

    val temperatureSensation : Float,

    val minTemperature : Float,

    val maxTemperature : Float,

    val pressure : Float,

    val humidity : Float,  //review just in case it have to be integer

    val seaLevel : Float,

    val groundLevel : Float,
)

data class Weather(

    val id : Int,

    val weather: String,

    val detailedWeather : String,

    val icon : String
)

data class Coord(
    val longitude : Float,

    val latitude : Float

)
