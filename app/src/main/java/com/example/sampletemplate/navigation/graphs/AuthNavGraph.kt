package com.example.sampletemplate.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.sampletemplate.navigation.AuthRouteScreen
import com.example.sampletemplate.navigation.Graph
import com.example.sampletemplate.screen.AuthScreen.LogInViewModel
import com.example.sampletemplate.screen.AuthScreen.LoginScreen
import com.example.sampletemplate.screen.AuthScreen.OnboardingScreen1
import com.example.sampletemplate.screen.AuthScreen.OnboardingScreen2
import com.example.sampletemplate.screen.AuthScreen.OnboardingScreen3
import com.example.sampletemplate.screen.AuthScreen.RegisterScreen
import com.example.sampletemplate.screen.AuthScreen.SignupViewModel


fun NavGraphBuilder.authNavGraph( rootNavController:NavHostController)
{

    navigation(route=Graph.AUTHENTICATIONGraph,
        startDestination = AuthRouteScreen.ONBOARDING1.route)
    {

        composable(route= AuthRouteScreen.ONBOARDING1.route){
            OnboardingScreen1(navController =  rootNavController)
        }
        composable(route= AuthRouteScreen.ONBOARDING2.route){
            
            OnboardingScreen2(navController = rootNavController)
        }
        composable(route= AuthRouteScreen.ONBOARDING3.route){
            OnboardingScreen3(navController = rootNavController)
        }
        composable(route= AuthRouteScreen.Login.route){
            val viewModel=  it.sharedViewModel<LogInViewModel>(rootNavController)
            LoginScreen(navController = rootNavController, viewModel = viewModel)
        }
        composable(route= AuthRouteScreen.SignUp.route){

            val viewModelup = it.sharedViewModel<SignupViewModel>(rootNavController)
        RegisterScreen(navController = rootNavController, viewModel = viewModelup)
        }
    }
}


@Composable
inline fun <reified T : ViewModel> NavBackStackEntry.sharedViewModel(navController: NavController): T {
    val navGraphRoute = destination.parent?.route ?: return viewModel()
    val parentEntry = remember(this) {
        navController.getBackStackEntry(navGraphRoute)
    }
    return viewModel(parentEntry)
}