package com.example.sampletemplate.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.sampletemplate.navigation.AuthRouteScreen
import com.example.sampletemplate.navigation.Graph
import com.example.sampletemplate.navigation.SettingRouteScreen
import com.example.sampletemplate.screen.AuthScreen.LogInViewModel
import com.example.sampletemplate.screen.setting.AboutScreen
import com.example.sampletemplate.screen.setting.ContactScreen
import com.example.sampletemplate.screen.setting.UserDetailScreen


fun NavGraphBuilder.settingNavGraph(rootNavController: NavHostController)
{

    navigation(route= Graph.SettingGraph,
        startDestination = SettingRouteScreen.MainSetting.route)
    {

        composable(route= SettingRouteScreen.MainSetting.route){
            //SettingScreen(navController =rootNavController)
            val viewModel=  it.sharedViewModel<LogInViewModel>(rootNavController)
            UserDetailScreen(viewmodel =viewModel , rootnavController = rootNavController)
        }
        composable(route=SettingRouteScreen.AboutUs.route){
            AboutScreen()
        }

        composable(route= SettingRouteScreen.Contact.route){




            ContactScreen()
        }
    }
}

