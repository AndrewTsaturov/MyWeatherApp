package com.andrewtsaturov.weatherapp.data.api.response.weather


import com.google.gson.annotations.SerializedName

data class Snow(
    @SerializedName("3h")
    val h: Double?
)