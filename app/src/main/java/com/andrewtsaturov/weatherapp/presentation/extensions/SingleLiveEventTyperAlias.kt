package com.andrewtsaturov.weatherapp.presentation.extensions

import androidx.navigation.NavDirections
import com.andrewtsaturov.weatherapp.presentation.platform.SingleLiveEvent

typealias MessageEvent = SingleLiveEvent<Int>
typealias NavigationEvent = SingleLiveEvent<NavDirections>
typealias ListScrollEvent = SingleLiveEvent<Int>