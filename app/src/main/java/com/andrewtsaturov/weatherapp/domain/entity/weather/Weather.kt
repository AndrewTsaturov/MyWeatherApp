package com.andrewtsaturov.weatherapp.domain.entity.weather

data class Weather(
    val temperature: Double,
    val humidity: Double,
    val pressure: Double,
    val precipitation: Precipitation,
    val precipitationProbability: Double,
    val windDirection: WindDirection,
    val windSpeed: Double,
    val windDirectionAngle: Double
)