package com.andrewtsaturov.weatherapp.domain.repository

import com.andrewtsaturov.weatherapp.data.entity.geo.Geo
import com.andrewtsaturov.weatherapp.data.entity.time_items.WeatherDay
import io.reactivex.Observable
import io.reactivex.Single

interface WeatherRepository {
    fun observeWeatherDays(): Observable<List<WeatherDay>>
    fun getWeatherByGeo(geo: Geo): Single<List<WeatherDay>>

    fun setShowingWeatherDay(weatherDay: WeatherDay)
    fun observeShowingWeatherDay(): Observable<WeatherDay>
}