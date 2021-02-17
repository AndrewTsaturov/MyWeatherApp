package com.begeton.presentation.platform

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.andrewtsaturov.weatherapp.presentation.extensions.nonNullObserve

abstract class BaseVMFragment<VM : BaseViewModel> : BaseFragment() {

    protected abstract val viewModel: VM

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.snackbarMessage.nonNullObserve(viewLifecycleOwner) { Toast.makeText(context, it, Toast.LENGTH_LONG).show() }
        viewModel.navigationEvent.nonNullObserve(viewLifecycleOwner){ navigate(it) }
    }
}