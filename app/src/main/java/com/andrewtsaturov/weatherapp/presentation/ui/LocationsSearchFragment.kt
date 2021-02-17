package com.andrewtsaturov.weatherapp.presentation.ui

import android.os.Bundle
import android.view.View
import com.andrewtsaturov.weatherapp.presentation.view_model.HomeViewModel
import com.begeton.presentation.platform.BaseVMFragment
import org.koin.android.ext.android.inject
import com.andrewtsaturov.weatherapp.R
import com.andrewtsaturov.weatherapp.presentation.view_model.LocationsSearchViewModel

class LocationsSearchFragment: BaseVMFragment<LocationsSearchViewModel>(){
    override val viewModel: LocationsSearchViewModel by inject()
    override val layoutId: Int = R.layout.fragment_location_search

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }
}