package com.videonatics.demo.features.splash.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.videonatics.demo.app.PageRoute
import com.videonatics.demo.features.splash.presentation.ui.SplashScreen


fun NavGraphBuilder.splashGraph(navController: NavController) {
    composable(PageRoute.SPLASH.name) { SplashScreen{
        navController.navigate(it){
            popUpTo(PageRoute.SPLASH.name) { inclusive = true } //changes
        }
    } }
}