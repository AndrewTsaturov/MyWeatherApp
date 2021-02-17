package com.andrewtsaturov.weatherapp.presentation.view_model

import androidx.lifecycle.MutableLiveData
import com.andrewtsaturov.weatherapp.data.entity.geo.Geo
import com.andrewtsaturov.weatherapp.domain.repository.GeoRepository
import com.begeton.presentation.platform.BaseViewModel

class MyLocationsViewModel(
    private val geoRepository: GeoRepository
): BaseViewModel() {
    val locationsData = MutableLiveData<Geo>()

    fun observeData(){

    }

    fun setGeoAsMain(){

    }

    fun onGeoDeleteClicked(){

    }
}