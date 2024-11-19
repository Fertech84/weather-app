package com.example.weatherapplication.data.dto

import com.google.gson.annotations.SerializedName

data class WeatherInDTO(

    @SerializedName("coord")
    val coordinates : CoordDTO,

    @SerializedName("weather")
    val weather : List<WeatherDTO> ,

    @SerializedName("base")
    val base : String,

    @SerializedName("main")
    val mainInfo : MainWeatherInfoDTO,

    @SerializedName("visibility")
    val visibility : Float,

    @SerializedName("wind")
    val wind : WeatherWindDTO,

)



data class WeatherWindDTO(
    @SerializedName("speed")
    val speed : Float,

    @SerializedName("deg")
    val degrees : Float,

    @SerializedName("gust")
    val gust : Float
)


data class MainWeatherInfoDTO(
    @SerializedName("temp")
    val temperature : Float,

    @SerializedName("feels_like")
    val temperatureSensation : Float,

    @SerializedName("temp_min")
    val minTemperature : Float,

    @SerializedName("temp_max")
    val maxTemperature : Float,

    @SerializedName("pressure")
    val pressure : Float,

    @SerializedName("humidity")
    val humidity : Float,  //review just in case it have to be integer

    @SerializedName("sea_level")
    val seaLevel : Float,

    @SerializedName("grnd_level")
    val groundLevel : Float,
)

data class WeatherDTO(

    @SerializedName("id")
    val id : Int,

    @SerializedName("main")
    val weather: String,

    @SerializedName("description")
    val detailedWeather : String,

    @SerializedName("icon")
    val icon : String
)

data class CoordDTO(
    @SerializedName("lon")
    val longitude : Float,

    @SerializedName("lat")
    val latitude : Float

)
