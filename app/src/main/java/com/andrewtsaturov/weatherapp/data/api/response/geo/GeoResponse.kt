package com.andrewtsaturov.weatherapp.data.api.response.geo

import com.google.gson.annotations.SerializedName

class GeoResponse(
    val name: String?,
    @SerializedName("local_names") val localNames: LocalNameResponse?,
    val lat: Double?,
    val lon: Double?,
    val country: String?
)