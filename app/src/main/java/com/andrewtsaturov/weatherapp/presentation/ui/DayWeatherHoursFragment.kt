package com.andrewtsaturov.weatherapp.presentation.ui

import android.os.Bundle
import android.view.View
import com.begeton.presentation.platform.BaseVMFragment
import org.koin.android.ext.android.inject
import com.andrewtsaturov.weatherapp.R
import com.andrewtsaturov.weatherapp.presentation.view_model.DayWeatherHoursViewModel

class DayWeatherHoursFragment: BaseVMFragment<DayWeatherHoursViewModel>(){
    override val viewModel: DayWeatherHoursViewModel by inject()
    override val layoutId: Int = R.layout.fragment_day_weather_hours

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }
}