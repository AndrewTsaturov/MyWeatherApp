package com.andrewtsaturov.weatherapp.presentation.view_model

import androidx.lifecycle.MutableLiveData
import com.andrewtsaturov.weatherapp.data.entity.geo.Geo
import com.andrewtsaturov.weatherapp.data.entity.time_items.WeatherDay
import com.andrewtsaturov.weatherapp.data.entity.weather.Weather
import com.andrewtsaturov.weatherapp.domain.repository.GeoRepository
import com.andrewtsaturov.weatherapp.domain.repository.WeatherRepository
import com.begeton.presentation.platform.BaseViewModel
import io.reactivex.rxkotlin.plusAssign

class HomeViewModel(
    private val geoRepository: GeoRepository,
    private val weatherRepository: WeatherRepository
): BaseViewModel() {
    val selectedGeoData = MutableLiveData<Geo>()
    val daysWeatherData = MutableLiveData<List<WeatherDay>>()
    val isLoading = MutableLiveData<Boolean>()

    fun observeData(){
        disposables += geoRepository
            .observeDefaultGeo()
            .subscribe({
                selectedGeoData.postValue(it)
            }, {
                it.printStackTrace()
            })

        disposables += weatherRepository
            .observeWeatherDays()
            .subscribe({
                daysWeatherData.postValue(it)
            }, {
                it.printStackTrace()
            })
    }

    fun loadWeather(geo: Geo){
        disposables += weatherRepository
            .getWeatherByGeo(geo)
            .doOnSubscribe { isLoading.postValue(true) }
            .doFinally { isLoading.postValue(true) }
            .subscribe({}, {
                it.printStackTrace()
                responseErrorHandler(it)
            })
    }

    fun onDayClicked(day: WeatherDay){
        weatherRepository.setShowingWeatherDay(day)
    }

    fun navigateToMap(){

    }

    fun navigateToLocationTextSearch(){

    }
}