package com.videonatics.demo.features.home.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.videonatics.demo.app.PageRoute
import com.videonatics.demo.features.home.presentation.ui.HomePage

fun NavGraphBuilder.homeGraph(navController: NavController) {
    composable(PageRoute.HOME.name) {
        HomePage{
            navController.navigate(it){
                popUpTo(PageRoute.AUTH.name) { inclusive = true }
            }
        }
    }
}