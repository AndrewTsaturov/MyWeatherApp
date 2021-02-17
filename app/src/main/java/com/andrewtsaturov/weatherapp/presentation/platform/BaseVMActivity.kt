package com.begeton.presentation.platform

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseVMActivity<VM : BaseViewModel> : AppCompatActivity() {

    protected abstract val viewModel: VM
    protected abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
    }
}