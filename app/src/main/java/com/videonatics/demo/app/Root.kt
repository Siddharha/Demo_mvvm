package com.videonatics.demo.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.videonatics.demo.features.auth.presentation.navigation.authGraph
import com.videonatics.demo.features.auth.presentation.ui.AuthPage
import com.videonatics.demo.features.home.presentation.navigation.homeGraph
import com.videonatics.demo.features.splash.presentation.navigation.splashGraph

@Composable
fun RootPage(){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = PageRoute.SPLASH.name
    ) {
        splashGraph(navController)
        authGraph(navController)
        homeGraph(navController)

    }

}

enum class PageRoute{
    SPLASH,AUTH,HOME
}