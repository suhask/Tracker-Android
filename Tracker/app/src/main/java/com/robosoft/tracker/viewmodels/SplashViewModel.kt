package com.robosoft.tracker.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

class SplashViewModel: ViewModel() {
    private val mutableStateFlow = MutableStateFlow(false)
    val hasLoaded = mutableStateFlow

    init {
        viewModelScope.launch {
            delay(2000,)
            mutableStateFlow.value = true
        }
    }
}