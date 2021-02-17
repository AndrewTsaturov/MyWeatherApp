package com.andrewtsaturov.weatherapp.data.entity.time_items

data class WeatherDay(
    val date: Long,
    val geoName: String,
    val weatherHours: List<WeatherHour>
)