package com.andrewtsaturov.weatherapp.presentation

import com.andrewtsaturov.weatherapp.presentation.view_model.*
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(get(), get()) }
    viewModel { DayWeatherHoursViewModel(get()) }
    viewModel { LocationsSearchViewModel(get()) }
    viewModel { MyLocationsViewModel(get()) }
    viewModel { MapViewModel(get()) }
}