package com.example.justauth.presentation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.justauth.presentation.viewmodel.LoginViewModel

@Composable
fun LoginScreen(
    onLoginSuccessNavigation: () -> Unit,
    onNavigateRegisterScreen: () -> Unit,
    loginViewModel: LoginViewModel = hiltViewModel()
) {

}