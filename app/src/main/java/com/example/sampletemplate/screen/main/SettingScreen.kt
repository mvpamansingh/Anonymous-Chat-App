package com.example.sampletemplate.screen.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sampletemplate.navigation.SettingRouteScreen


@Composable
fun SettingScreen(navController: NavController) {
    Column(
        modifier = Modifier

            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Setting Screen",
            fontSize = 40.sp,
            color = Color.Black

        )

        Button(onClick = { navController.navigate(SettingRouteScreen.SettingDetail.route)}) {
            Text(text = "Go to Setting Detail Page")
        }

    }
}