package com.example.weatherapplication.domain.model

data class WeatherData(

    val coordinates : Coord,

    val weather : List<Weather> ,



    val mainInfo : MainWeatherInfo,





    )





data class MainWeatherInfo(
    val temperature : Double,

    val temperatureSensation : Double,

    val minTemperature : Double,

    val maxTemperature : Double,

    val pressure : Int,

    val humidity : Int,  //review just in case it have to be integer

    val seaLevel : Int,

    val groundLevel : Int,
)

data class Weather(

    val id : Long,

    val weather: String,

    val detailedWeather : String,

    val icon : String
)

data class Coord(
    val longitude : Double,

    val latitude : Double

)
