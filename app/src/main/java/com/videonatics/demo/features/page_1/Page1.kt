package com.videonatics.demo.features.page_1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.videonatics.demo.ui.theme.DemoTheme

@Composable
fun Page1() {
    Box(modifier = Modifier
        .background(color = Color.Blue)
        .fillMaxSize()){
    }
}

@Preview(showBackground = true)
@Composable
fun Page1Preview() {
    DemoTheme {
        Page1 ()
    }
}