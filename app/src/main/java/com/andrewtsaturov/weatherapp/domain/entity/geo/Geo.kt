package com.andrewtsaturov.weatherapp.domain.entity.geo

import androidx.room.Entity

@Entity(primaryKeys = arrayOf("latitude", "longitude"))
data class Geo(
    val name: String,
    val title: String,
    val latitude: Double,
    val longitude: Double
)