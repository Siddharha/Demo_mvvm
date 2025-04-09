package com.videonatics.demo.features.splash.presentation.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.videonatics.demo.features.splash.presentation.viewmodel.SplashViewModel
import com.videonatics.demo.ui.theme.DemoTheme

@Composable
fun SplashScreen(viewModel: SplashViewModel = hiltViewModel(),
                 onNavigate: (String) -> Unit) {
    val destination = viewModel.navigateTo.collectAsState()

    LaunchedEffect(destination.value !=null) {
        destination.value?.let {
            onNavigate(it)
        }


    }

    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()){
        Text("Splash", style = TextStyle(fontSize = 20.sp))
    }

}

@Preview(showBackground = true)
@Composable
fun SplashPreview() {
    DemoTheme {
        SplashScreen{}
    }
}