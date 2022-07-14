package com.example.composefigmalogin.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composefigmalogin.R
import kotlin.math.sin

@Composable
fun RegisterPage(navController: NavController) {

    val userName = remember {
        mutableStateOf("")
    }
    val email = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    val confirmPassword = remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxWidth(), Arrangement.Center) {
            Text(
                text = "Welcome OnBoard",
                color = Color.Blue,
                fontSize = 20.sp,
                modifier = Modifier.padding(20.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Icon(
                painterResource(id = R.drawable.splash_logo1_foreground),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .fillMaxHeight(0.3f)
            )
        }
        Spacer(modifier = Modifier.padding(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(), Arrangement.Center
        ) {
            OutlinedTextField(
                value = userName.value, onValueChange = { userName.value = it },
                label = { Text(text = "UserName") },
                placeholder = { Text(text = "UserName") },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                 modifier = Modifier.fillMaxWidth(0.9f)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(), Arrangement.Center
        ) {
            OutlinedTextField(
                value = email.value, onValueChange = { email.value = it },
                label = { Text(text = "Email") },
                placeholder = { Text(text = "Email") },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                modifier = Modifier.fillMaxWidth(0.9f)
            )
        }
        Row(modifier = Modifier.fillMaxWidth(), Arrangement.Center) {
            OutlinedTextField(
                value = password.value, onValueChange = { password.value = it },
                label = { Text(text = "Password") },
                placeholder = { Text(text = "Password") },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                modifier = Modifier.fillMaxWidth(0.9f)
            )

        }
        Row(
            modifier = Modifier
                .fillMaxWidth(), Arrangement.Center
        ) {
            OutlinedTextField(
                value = confirmPassword.value, onValueChange = { confirmPassword.value = it },
                label = { Text(text = "Confirm Password") },
                placeholder = { Text(text = "Confirm Password") },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                modifier = Modifier.fillMaxWidth(0.9f)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(), Arrangement.Center
        ) {
            Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth(0.9f)) {
                Text(text = "Register")
            }
        }
        Spacer(modifier = Modifier.padding(15.dp))
        Row(modifier = Modifier.fillMaxWidth(), Arrangement.Center) {
            Text(text = "Login Instead", modifier = Modifier
                .clickable { navController.navigate("login_page") })
        }
    }
}