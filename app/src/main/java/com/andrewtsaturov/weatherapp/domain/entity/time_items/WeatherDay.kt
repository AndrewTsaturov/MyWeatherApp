package com.andrewtsaturov.weatherapp.domain.entity.time_items

data class WeatherDay(
    val date: Long,
    val weatherHours: List<WeatherHour>
)