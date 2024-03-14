package com.example.sampletemplate.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.chatapptrial.ChatViewModel
import com.example.sampletemplate.OpenWorldChat.ChatScreen
import com.example.sampletemplate.navigation.Graph
import com.example.sampletemplate.navigation.MainRouteScreen
import com.example.sampletemplate.screen.AuthScreen.LogInViewModel
import com.example.sampletemplate.screen.main.HomeScreen
import com.example.sampletemplate.screen.main.NotificationScreen
import com.example.sampletemplate.screen.main.ProfileScreen

import com.example.sampletemplate.screen.setting.UserDetailScreen


@Composable
fun MainNavGraph(
    rootNavController:NavHostController,
    homeNavController: NavHostController
)
{




    NavHost(navController = homeNavController,
        route = Graph.MAINSCREENGraph, 
        startDestination =MainRouteScreen.Home.route )
    {

        composable(route=MainRouteScreen.Home.route)
        {
            val viewModelC=  it.sharedViewModel<ChatViewModel>(rootNavController)

            ChatScreen(viewModel = viewModelC)
        }
        composable(route=MainRouteScreen.Notification.route)
        {
            NotificationScreen(navController = rootNavController)
        }
        composable(route=MainRouteScreen.Profile.route)
        {
            ProfileScreen( )
        }
        composable(route=MainRouteScreen.Setting.route)
        {
            //SettingScreen(navController = rootNavController )
            val viewModel=  it.sharedViewModel<LogInViewModel>(rootNavController)
            UserDetailScreen(viewmodel =viewModel , rootnavController =rootNavController )
        }


    }
}