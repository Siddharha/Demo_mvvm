package com.videonatics.demo.app

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.videonatics.demo.features.auth.presentation.navigation.authGraph
import com.videonatics.demo.features.home.presentation.navigation.homeGraph
import com.videonatics.demo.features.page_1.homePage1Graph
import com.videonatics.demo.features.page_2.homePage2Graph
import com.videonatics.demo.features.splash.presentation.navigation.splashGraph

@Composable
fun RootPage(){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = PageRoute.SPLASH.name
    ) {
        splashGraph(navController)
        authGraph(navController)
        homeGraph()

    }

}

@Composable
fun MenuHomePage(selectedPage: Int) {
    val navController = rememberNavController()

    LaunchedEffect(selectedPage) {
        when(selectedPage){
            MenuPageRoute.PAGE_1.ordinal -> {
                navController.navigate(MenuPageRoute.PAGE_1.name)
            }
            MenuPageRoute.PAGE_2.ordinal -> {
                navController.navigate(MenuPageRoute.PAGE_2.name)
            }
        }
    }


    NavHost(navController = navController,
        startDestination = MenuPageRoute.PAGE_1.name
    ) {
        homePage1Graph()
        homePage2Graph()

    }

}

enum class PageRoute{
    SPLASH,AUTH,HOME
}

enum class MenuPageRoute{
    PAGE_1,PAGE_2

}