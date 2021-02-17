package com.andrewtsaturov.weatherapp.data.cache.db

import androidx.room.TypeConverter
import com.andrewtsaturov.weatherapp.data.entity.weather.Precipitation
import com.andrewtsaturov.weatherapp.data.entity.weather.WindDirection

class WeatherEnumConverter {
    @TypeConverter
    fun toPrecipitation(name: String) = enumValueOf<Precipitation>(name)

    @TypeConverter
    fun fromPrecipitation(value: Precipitation) = value.name

    @TypeConverter
    fun toWindDirection(name: String) = enumValueOf<WindDirection>(name)

    @TypeConverter
    fun fromWindDirection(value: WindDirection) = value.name
}