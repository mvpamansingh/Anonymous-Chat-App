package com.example.sampletemplate.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.sampletemplate.navigation.AuthRouteScreen
import com.example.sampletemplate.navigation.Graph
import com.example.sampletemplate.navigation.NotificationRouteScreen
import com.example.sampletemplate.screen.main.NotificationScreen



fun NavGraphBuilder.notificationNavGraph(rootNavController: NavHostController)
{

    navigation(route= Graph.NottificationGraph,
        startDestination = NotificationRouteScreen.NotificationDetail.route)
    {


        composable(route= NotificationRouteScreen.NotificationDetail.route)
        {
                NotificationScreen(navController = rootNavController)
        }
    }
}