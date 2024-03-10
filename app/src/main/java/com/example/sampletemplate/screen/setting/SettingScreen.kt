package com.example.sampletemplate.screen.setting

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Link
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.example.sampletemplate.R
import com.example.sampletemplate.navigation.AuthRouteScreen
import com.example.sampletemplate.navigation.Graph
import com.example.sampletemplate.navigation.SettingRouteScreen
import com.example.sampletemplate.screen.AuthScreen.LogInViewModel
import kotlinx.coroutines.launch


@Composable
fun SettingDetailScreen(rootnavController: NavController) {
    Column(
        modifier = Modifier

            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Setting Detail Screen",
            fontSize = 40.sp,
            color = Color.Black

        )
        
        
        
        Button(onClick = {

            rootnavController.navigate(AuthRouteScreen.Login.route){
                popUpTo(Graph.MAINSCREENGraph){
                    inclusive=true
                }
                launchSingleTop= true
            }
        }) {
            Text(text = "Log out")
        }
    }
}


@Composable
fun UserDetailScreen(viewmodel: LogInViewModel, rootnavController:NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Row (modifier= Modifier
            .fillMaxWidth()
            .padding(start = 20.dp),horizontalArrangement = Arrangement.Center){

            androidx.compose.material.Text(text = "Settings", fontSize = 32.sp, fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.SemiBold)

        }
        Spacer(modifier =Modifier.height(12.dp))
        // User Image with circular background
        Box(modifier = Modifier.padding(top = 24.dp)) {
            Image(
                painter = painterResource(id = R.drawable.duckk), // Replace with your image
                contentDescription = "User Profile Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )
        }

        // User Name
        androidx.compose.material.Text(
            text = "John Doe",
            style = MaterialTheme.typography.h6,
            modifier = Modifier.padding(top = 16.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Column of Items
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            UserItem(Icons.Filled.AccountBox, "Edit Profile",{})
            Spacer(modifier = Modifier.height(9.dp))
            UserItem(Icons.Filled.Link, "Connect",{rootnavController.navigate(SettingRouteScreen.Contact.route)})
            Spacer(modifier = Modifier.height(9.dp))
            UserItem(Icons.Filled.Info, "About us",{rootnavController.navigate(SettingRouteScreen.AboutUs.route)})
            Spacer(modifier = Modifier.height(9.dp))
            UserItem(Icons.Filled.Logout, "Logout",{
                viewmodel.viewModelScope.launch {
                    viewmodel.signOut()
                }
            })
        }
    }
}

@Composable
fun UserItem(icon: ImageVector, name: String, onclick:()->Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth().clickable { onclick() },
        elevation = 4.dp // Add shadow
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(5.dp))
            Icon(icon, contentDescription = name, modifier = Modifier.padding(end = 16.dp), tint=if (name=="Logout") Color.Red else Color.Black)
            androidx.compose.material.Text(text = name, style = MaterialTheme.typography.body1, color = if (name=="Logout") Color.Red else Color.Black)
        }
    }
}
