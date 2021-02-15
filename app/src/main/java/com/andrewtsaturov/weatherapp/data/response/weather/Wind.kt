package com.andrewtsaturov.weatherapp.data.response.weather


import com.google.gson.annotations.SerializedName

data class Wind(
    val deg: Int?,
    val speed: Double?
)