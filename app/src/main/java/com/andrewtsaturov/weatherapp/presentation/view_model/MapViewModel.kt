package com.andrewtsaturov.weatherapp.presentation.view_model

import androidx.lifecycle.MutableLiveData
import com.andrewtsaturov.weatherapp.data.entity.geo.Geo
import com.andrewtsaturov.weatherapp.domain.repository.GeoRepository
import com.begeton.presentation.platform.BaseViewModel

class MapViewModel(
    private val geoRepository: GeoRepository
): BaseViewModel() {
    val myGeoLiveData = MutableLiveData<Geo>()

    fun observeChoosedGeo(){

    }

    fun findGeoByCoords(latitude: Double, longitude: Double){

    }
}