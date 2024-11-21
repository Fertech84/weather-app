package com.example.weatherapplication.data.dto

import com.google.gson.annotations.SerializedName

data class WeatherInDTO(

    @SerializedName("coord")
    val coordinates : CoordDTO,

    @SerializedName("weather")
    val weather : List<WeatherDTO> ,

    @SerializedName("main")
    val mainInfo : MainWeatherInfoDTO,


)






data class MainWeatherInfoDTO(
    @SerializedName("temp")
    val temperature : Double,

    @SerializedName("feels_like")
    val temperatureSensation : Double,

    @SerializedName("temp_min")
    val minTemperature : Double,

    @SerializedName("temp_max")
    val maxTemperature : Double,

    @SerializedName("pressure")
    val pressure : Int,

    @SerializedName("humidity")
    val humidity : Int,  //review just in case it have to be integer

    @SerializedName("sea_level")
    val seaLevel : Int,

    @SerializedName("grnd_level")
    val groundLevel : Int,
)

data class WeatherDTO(

    @SerializedName("id")
    val id : Long,

    @SerializedName("main")
    val weather: String,

    @SerializedName("description")
    val detailedWeather : String,

    @SerializedName("icon")
    val icon : String
)

data class CoordDTO(
    @SerializedName("lon")
    val longitude : Double,

    @SerializedName("lat")
    val latitude : Double

)
