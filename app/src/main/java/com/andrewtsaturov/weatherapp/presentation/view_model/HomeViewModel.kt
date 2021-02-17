package com.andrewtsaturov.weatherapp.presentation.view_model

import androidx.lifecycle.MutableLiveData
import com.andrewtsaturov.weatherapp.data.entity.geo.Geo
import com.andrewtsaturov.weatherapp.data.entity.time_items.WeatherDay
import com.andrewtsaturov.weatherapp.data.entity.weather.Weather
import com.andrewtsaturov.weatherapp.domain.repository.GeoRepository
import com.andrewtsaturov.weatherapp.domain.repository.WeatherRepository
import com.begeton.presentation.platform.BaseViewModel

class HomeViewModel(
    private val geoRepository: GeoRepository,
    private val weatherRepository: WeatherRepository
): BaseViewModel() {
    val selectedGeoData = MutableLiveData<Geo>()
    val daysWeatherData = MutableLiveData<List<WeatherDay>>()
    val isLoading = MutableLiveData<Boolean>()

    fun observeData(){

    }

    fun loadWeather(geo: Geo){

    }

    fun onDayClicked(day: WeatherDay){

    }

    fun navigateToMap(){

    }

    fun navigateToLocationTextSearch(){

    }
}