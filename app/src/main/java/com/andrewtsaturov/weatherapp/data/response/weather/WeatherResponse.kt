package com.andrewtsaturov.weatherapp.data.response.weather


import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    val clouds: Clouds?,
    val dt: Int?,
    @SerializedName("dt_txt")
    val dtTxt: String?,
    val main: Main?,
    val pop: Int?,
    val snow: Snow?,
    val sys: Sys?,
    val visibility: Int?,
    val weather: List<Weather>?,
    val wind: Wind?
)