package com.videonatics.demo.features.page_2

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.videonatics.demo.app.MenuPageRoute

fun NavGraphBuilder.homePage2Graph() {
    composable(MenuPageRoute.PAGE_2.name) {
        Page2()
    }
}