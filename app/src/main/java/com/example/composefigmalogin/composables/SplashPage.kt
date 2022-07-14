package com.example.composefigmalogin.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.example.composefigmalogin.R
import kotlinx.coroutines.Delay
import kotlinx.coroutines.delay


@Composable
fun SplashPage(navController: NavController){

    LaunchedEffect(key1 = true ){
        delay(1000L)
        navController.navigate("login_page")
    }
    Box(modifier = Modifier.fillMaxSize()){
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            ConstraintLayout() {
                val(icon, text, button) = createRefs()
                Icon(painterResource(id = R.drawable.splash_logo1_foreground), contentDescription ="Splash Logo", modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .fillMaxHeight(0.3f)
                    .constrainAs(icon) {
                        top.linkTo(parent.top, 20.dp)
                    }
                )
                
                Text(stringResource(id = R.string.content), modifier = Modifier
                    .padding(10.dp)
                    .constrainAs(text) {
                        top.linkTo(icon.bottom, 30.dp)
                    })

                Button(onClick = { /*TODO*/ }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .height(50.dp)
                    .background(Color.Gray)
                    .constrainAs(button) {
                        top.linkTo(text.bottom, 30.dp)
                    }) {
                            Text(text = "Get Started")
                }

            }
        }
    }



}