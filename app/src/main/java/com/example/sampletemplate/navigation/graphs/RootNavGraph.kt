package com.example.sampletemplate.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sampletemplate.navigation.Graph
import com.example.sampletemplate.screen.main.MainScreen


@Composable
fun RootNavGraph()
{

    val rootNavController= rememberNavController()
    NavHost(navController = rootNavController,
        route = Graph.ROOTGraph,
        startDestination =Graph.AUTHENTICATIONGraph )
    {

        authNavGraph(rootNavController= rootNavController)
        composable(route= Graph.MAINSCREENGraph){
            MainScreen(rootNavHostController = rootNavController)
        }
         notificationNavGraph(rootNavController=rootNavController)
        settingNavGraph(rootNavController= rootNavController)

    }
}