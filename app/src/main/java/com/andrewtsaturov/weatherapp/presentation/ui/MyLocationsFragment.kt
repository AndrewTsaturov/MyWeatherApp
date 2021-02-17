package com.andrewtsaturov.weatherapp.presentation.ui

import android.os.Bundle
import android.view.View
import com.andrewtsaturov.weatherapp.presentation.view_model.HomeViewModel
import com.begeton.presentation.platform.BaseVMFragment
import org.koin.android.ext.android.inject
import com.andrewtsaturov.weatherapp.R
import com.andrewtsaturov.weatherapp.presentation.view_model.MyLocationsViewModel

class MyLocationsFragment: BaseVMFragment<MyLocationsViewModel>(){
    override val viewModel: MyLocationsViewModel by inject()
    override val layoutId: Int = R.layout.fragment_my_locations

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }
}