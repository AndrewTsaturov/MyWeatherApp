package com.andrewtsaturov.weatherapp.domain.entity.geo

import androidx.room.Entity

@Entity
data class Geo(
    val name: String,
    val title: String,
    val latitude: Double,
    val longitude: Double
)