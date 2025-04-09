package com.videonatics.demo.features.page_1

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.videonatics.demo.app.MenuPageRoute

fun NavGraphBuilder.homePage1Graph() {


    composable(MenuPageRoute.PAGE_1.name) {
        Page1()
    }
}