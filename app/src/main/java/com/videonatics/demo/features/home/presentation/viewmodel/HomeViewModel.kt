package com.videonatics.demo.features.home.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.videonatics.demo.app.MenuPageRoute
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(

) : ViewModel() {
    private var _selectedPage by mutableIntStateOf(0)

    val selectedPage: Int
        get() = _selectedPage

    fun onPageChange(route: MenuPageRoute) {
        _selectedPage = route.ordinal

    }

}