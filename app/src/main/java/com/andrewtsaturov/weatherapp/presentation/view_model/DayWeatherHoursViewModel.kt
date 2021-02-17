package com.andrewtsaturov.weatherapp.presentation.view_model

import androidx.lifecycle.MutableLiveData
import com.andrewtsaturov.weatherapp.data.entity.time_items.WeatherDay
import com.andrewtsaturov.weatherapp.domain.repository.WeatherRepository
import com.begeton.presentation.platform.BaseViewModel

class DayWeatherHoursViewModel(
    private val weatherRepository: WeatherRepository
): BaseViewModel() {
    val weatherDayData = MutableLiveData<WeatherDay>()

    fun observeData() {

    }
}