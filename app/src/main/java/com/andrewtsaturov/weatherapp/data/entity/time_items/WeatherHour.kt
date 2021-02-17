package com.andrewtsaturov.weatherapp.data.entity.time_items

import com.andrewtsaturov.weatherapp.data.entity.weather.Weather

data class WeatherHour(
    val hourOfaDay: Int,
    val weather: Weather
)