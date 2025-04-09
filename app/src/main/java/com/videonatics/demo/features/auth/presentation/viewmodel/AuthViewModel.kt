package com.videonatics.demo.features.auth.presentation.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(

) : ViewModel(){
    fun login(user: String,
              password: String,
              onLoginError: () -> Unit ={},
              onLoginSuccess: () -> Unit) {
        if(user == "admin" && password == "admin"){
            onLoginSuccess.invoke()

        }else{
            onLoginError.invoke()
        }
    }

}