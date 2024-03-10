package com.example.sampletemplate.screen.main

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
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.sampletemplate.navigation.NotificationRouteScreen

@Composable
fun NotificationScreen(navController: NavController)
{
    Column(modifier= Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {




        Text(text = "Notification sCREEN", fontSize = 40.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate(NotificationRouteScreen.NotificationDetail.route)}) {
            Text(text = "Notification Detail Screen")
        }
    }
}