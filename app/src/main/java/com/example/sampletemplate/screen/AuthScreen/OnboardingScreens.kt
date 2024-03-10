package com.example.sampletemplate.screen.AuthScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sampletemplate.navigation.AuthRouteScreen


@Composable
fun OnboardingScreen1(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Onboarding Screen 1", fontSize = 39.sp)
        Spacer(modifier= Modifier.height(40.dp))

        Button(onClick = {navController.navigate(AuthRouteScreen.ONBOARDING2.route)}) {
            Text("Go to 2nd board")
        }
    }
}

@Composable
fun OnboardingScreen2(navController: NavController,) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Onboarding Screen 2", fontSize = 39.sp)
        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = {
            navController.navigate(AuthRouteScreen.ONBOARDING3.route)
        }) {
            Text("Go to 3rd onboard")
        }
    }
}

@Composable
fun OnboardingScreen3(navController: NavController,) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Onboarding Screen 3", fontSize = 39.sp)
        Spacer(Modifier.height(40.dp))

        Button(onClick = {

            navController.navigate(AuthRouteScreen.Login.route)
        }) {
            Text("Finish Onboarding")
        }
    }
}