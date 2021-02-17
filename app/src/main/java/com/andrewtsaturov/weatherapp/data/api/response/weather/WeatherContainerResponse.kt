package com.andrewtsaturov.weatherapp.data.api.response.weather


data class WeatherContainerResponse(
    val city: City?,
    val cnt: Int?,
    val cod: String?,
    val list: List<WeatherResponse>?,
    val message: Int?
)