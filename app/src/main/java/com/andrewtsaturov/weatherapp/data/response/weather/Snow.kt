package com.andrewtsaturov.weatherapp.data.response.weather


import com.google.gson.annotations.SerializedName

data class Snow(
    @SerializedName("3h")
    val h: Double?
)