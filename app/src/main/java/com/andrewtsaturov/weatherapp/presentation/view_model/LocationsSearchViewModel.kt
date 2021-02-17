package com.andrewtsaturov.weatherapp.presentation.view_model

import androidx.lifecycle.MutableLiveData
import com.andrewtsaturov.weatherapp.data.entity.geo.Geo
import com.andrewtsaturov.weatherapp.domain.repository.GeoRepository
import com.begeton.presentation.platform.BaseViewModel

class LocationsSearchViewModel(
    private val geoRepository: GeoRepository
): BaseViewModel() {
    val textSearchQueryData = MutableLiveData<String>()
    val searchResult = MutableLiveData<List<Geo>>()
    val isLoading = MutableLiveData<Boolean>()

    fun searchGeos(query: String){

    }

    fun addGeo(geo: Geo){

    }
}