package com.andrewtsaturov.weatherapp.data.cache

import com.andrewtsaturov.weatherapp.data.entity.time_items.WeatherDay
import io.reactivex.Observable
import io.reactivex.Single

interface WeatherMemoryCache {
    fun observeWeather(): Observable<List<WeatherDay>>
    fun updateWeather(items: List<WeatherDay>): Single<WeatherDay>
}