package com.example.composefigmalogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composefigmalogin.composables.LoginPage
import com.example.composefigmalogin.composables.RegisterPage
import com.example.composefigmalogin.composables.SplashPage
import com.example.composefigmalogin.ui.theme.ComposeFigmaLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeFigmaLoginTheme {
                // A surface container using the 'background' color from the theme
                HomePage()
            }
        }
    }
}


@Composable
fun HomePage(){
val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash_screen"){
        composable("splash_screen"){
            SplashPage(navController)
        }
        composable("login_page"){
            LoginPage(navController)
        }
        composable("register_page"){
            RegisterPage(navController)
        }
    }
}
