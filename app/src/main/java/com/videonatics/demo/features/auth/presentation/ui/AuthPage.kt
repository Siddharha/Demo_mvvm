package com.videonatics.demo.features.auth.presentation.ui

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.videonatics.demo.features.auth.presentation.viewmodel.AuthViewModel
import com.videonatics.demo.ui.theme.DemoTheme

@Composable
fun AuthPage(
    viewModel: AuthViewModel = hiltViewModel(),
    onAuthSuccess: () -> Unit) {
    var userName by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    val TAG = "AuthPage"
    Scaffold {padding ->
        Column (modifier = Modifier
            .padding(padding)
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text("Login")
            TextField(
                label = { Text("Username") },
                onValueChange = {
                userName = it
            },
                value = userName )
            TextField(
                trailingIcon = {
                    val image = if (passwordVisible)
                        Icons.Filled.Visibility
                    else Icons.Filled.VisibilityOff
                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                        Icon(imageVector = image, contentDescription = if (passwordVisible) "Hide password" else "Show password")
                    }
                },
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                label = { Text("Password") },
                onValueChange = {
                password = it
            },
                value = password,

                )
            Text("Forgot Password?")
            Button (onClick = {
                viewModel.login(userName, password, onLoginError = {
                    Log.e(TAG, "AuthPage: Error", )
                }){
                    onAuthSuccess.invoke()
                }
            }){
                Text("Login")
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun AuthPreview() {
    DemoTheme {
        AuthPage {}
    }
}