package com.example.composefigmalogin.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composefigmalogin.R


@Composable
fun LoginPage(navController: NavController){

    val userName = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier
        .fillMaxSize()) {
        Row(modifier = Modifier
            .fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "Welcome OnBoard", modifier = Modifier.padding(top = 10.dp), color = Color.Blue, fontSize = 20.sp)
        }

        Row(modifier = Modifier
            .fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Icon(painterResource(id = R.drawable.splash_logo1_foreground), contentDescription ="Splash Logo", modifier = Modifier
                .fillMaxWidth(0.9f)
                .fillMaxHeight(0.3f)
            )

        }

        Spacer(modifier = Modifier.padding(15.dp))

        Row(modifier = Modifier
            .fillMaxWidth(),
        Arrangement.Center) {
            OutlinedTextField(value = userName.value, onValueChange = {userName.value = it},
                label = { Text(text = "UserName")},
                placeholder = { Text(text = "UserName")},
                singleLine = true,
                modifier = Modifier.fillMaxWidth(0.9f),
                )
        }
        Row(modifier = Modifier
            .fillMaxWidth(), Arrangement.Center) {
            OutlinedTextField(value = password.value, onValueChange = {password.value = it},
            label={ Text(text = "Password")},
            placeholder = { Text(text = "Password")},
            singleLine = true,
             modifier = Modifier.fillMaxWidth(0.9f),)
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Button(onClick = { /*TODO*/ }, modifier = Modifier
                .fillMaxWidth(0.9f)) {
                Text(text = "Login")
            }
        }
        Spacer(modifier = Modifier.padding(20.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "Create An Account", modifier = Modifier
                .clickable { navController.navigate("register_page") })
        }

        
    }
}