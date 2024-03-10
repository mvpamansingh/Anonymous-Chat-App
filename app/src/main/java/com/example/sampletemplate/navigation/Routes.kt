package com.example.sampletemplate.navigation



object Graph{
    const val ROOTGraph = "root_graph"
    const val AUTHENTICATIONGraph = "auth_graph"
    const val MAINSCREENGraph= "main_screen_graph"
    const val NottificationGraph="notification_graph"
    const val SettingGraph = "settings_graph"
}
sealed class AuthRouteScreen(val route: String) {
    object ONBOARDING1 : AuthRouteScreen(route = "ONBOARDING1")
    object ONBOARDING2 : AuthRouteScreen(route = "ONBOARDING2")
    object ONBOARDING3 : AuthRouteScreen(route = "ONBOARDING3")
    object Login : AuthRouteScreen(route = "LOGIN")
    object SignUp : AuthRouteScreen(route = "SIGN_UP")

}


sealed class MainRouteScreen(val route: String) {
    object Home : MainRouteScreen(route = "home")
    object Profile : MainRouteScreen(route = "profile")
    object Notification : MainRouteScreen(route = "notification")

    object Setting : MainRouteScreen(route = "settings")

}

sealed class SettingRouteScreen(val route: String) {
    object SettingDetail:SettingRouteScreen(route ="setting")
    object AboutUs : SettingRouteScreen(route = "aboutus")

    object Contact : SettingRouteScreen(route = "contact")
}
sealed class NotificationRouteScreen(val route: String) {
    object NotificationDetail: NotificationRouteScreen(route = "notificationdetail")

}
