package com.videonatics.demo.features.home.presentation.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.videonatics.demo.ui.theme.DemoTheme

@Composable
fun HomePage(onPageChange: (String) -> Unit) {
    Scaffold(
        bottomBar = {
            BottomAppBar {
                IconButton(onClick = {
                    onPageChange.invoke("home")
                }) {
                     Icon(Icons.Filled.Home, contentDescription = "Home")
                }
                IconButton(onClick = {
                    onPageChange.invoke("settings")
                }) {
                    Icon(Icons.Filled.Settings, contentDescription = "Settings")
                }
            }
        }
    ){padding ->
        Box(modifier = Modifier.padding(padding))
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    DemoTheme {
        HomePage {}
    }
}