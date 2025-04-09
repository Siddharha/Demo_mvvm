package com.videonatics.demo.features.auth.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.videonatics.demo.app.PageRoute
import com.videonatics.demo.features.auth.presentation.ui.AuthPage

fun NavGraphBuilder.authGraph(navController: NavController) {
    composable(PageRoute.AUTH.name) {
        AuthPage{
            navController.navigate(PageRoute.HOME.name){
                popUpTo(PageRoute.AUTH.name) { inclusive = true }
            }
        }
    }
}