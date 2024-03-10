package com.example.sampletemplate.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.sampletemplate.navigation.AuthRouteScreen
import com.example.sampletemplate.navigation.Graph
import com.example.sampletemplate.navigation.SettingRouteScreen
import com.example.sampletemplate.screen.main.SettingScreen



fun NavGraphBuilder.settingNavGraph(rootNavController: NavHostController)
{

    navigation(route= Graph.SettingGraph,
        startDestination = SettingRouteScreen.SettingDetail.route)
    {

        composable(route= SettingRouteScreen.SettingDetail.route){
            SettingScreen(navController =rootNavController)
        }
//        composable(route=SettingRouteScreen.AboutUs.route){
//
//        }
//
//        composable(route= SettingRouteScreen.Contact.route){
//
//        }
    }
}

