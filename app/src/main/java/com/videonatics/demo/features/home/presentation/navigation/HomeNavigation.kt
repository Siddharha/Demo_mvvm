package com.videonatics.demo.features.home.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.videonatics.demo.app.PageRoute
import com.videonatics.demo.features.home.presentation.ui.HomePage

fun NavGraphBuilder.homeGraph() {
    composable(PageRoute.HOME.name) {
        HomePage()
    }
}