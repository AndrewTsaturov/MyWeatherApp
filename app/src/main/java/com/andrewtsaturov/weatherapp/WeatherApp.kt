package com.andrewtsaturov.weatherapp

import android.app.Application
import com.andrewtsaturov.weatherapp.data.dataModule
import com.andrewtsaturov.weatherapp.domain.domainModule
import com.andrewtsaturov.weatherapp.presentation.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class WeatherApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@WeatherApp)
            modules(listOf(
                    dataModule,
                    domainModule,
                    viewModelModule
                )
            )
        }
    }
}