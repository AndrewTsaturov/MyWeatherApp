package com.andrewtsaturov.weatherapp.domain.entity.time_items

import com.andrewtsaturov.weatherapp.domain.entity.weather.Weather

data class WeatherHour(
    val hourOfaDay: Int,
    val weather: Weather
)