package com.andrewtsaturov.weatherapp.domain.repository

import com.andrewtsaturov.weatherapp.data.entity.geo.Geo
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

interface GeoRepository {
    fun getPossibleNamesByStringName(request: String): Single<List<Geo>>
    fun getGeoByLatLng(latitude: Double, longitude: Double): Single<Geo>

    fun hasThisGeo(geo: Geo): Single<Boolean>
    fun updateDefaultGeo(geo: Geo): Completable
    fun updateGeo(geo: Geo): Completable

    fun observeSavedGeos(): Observable<List<Geo>>
}