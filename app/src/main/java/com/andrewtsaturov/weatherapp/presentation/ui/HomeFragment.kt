package com.andrewtsaturov.weatherapp.presentation.ui

import android.os.Bundle
import android.view.View
import com.andrewtsaturov.weatherapp.presentation.view_model.HomeViewModel
import com.begeton.presentation.platform.BaseVMFragment
import org.koin.android.ext.android.inject
import com.andrewtsaturov.weatherapp.R

class HomeFragment: BaseVMFragment<HomeViewModel>(){
    override val viewModel: HomeViewModel by inject()
    override val layoutId: Int = R.layout.fragment_home

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }
}