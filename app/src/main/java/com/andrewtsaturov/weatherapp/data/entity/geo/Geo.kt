package com.andrewtsaturov.weatherapp.data.entity.geo

import androidx.room.Entity

@Entity(primaryKeys = arrayOf("name", "latitude", "longitude"))
data class Geo(
    val name: String,
    val title: String,
    val latitude: Double,
    val longitude: Double
)