package com.andrewtsaturov.weatherapp.data.cache.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.andrewtsaturov.weatherapp.data.entity.geo.Geo

@Dao
interface GeoDao {
    @Query("SELECT * FROM geo")
    fun getGeo(): List<Geo>

    @Query("SELECT * FROM geo WHERE name LIKE (:stringQuery)")
    fun getGeosByName(stringQuery: String): List<Geo>

    @Insert
    fun saveGeo(vararg geo: Geo)

    @Delete
    fun deleteGeo()
}