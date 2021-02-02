package com.example.composenavigation

import androidx.compose.runtime.Composable
import com.example.composenavigation.navigation.StackNavigation
import com.example.composenavigation.navigation.TabNavigation

@Composable
fun DemoApp() {
//    StackNavigation(startDestination = "home", builder = { navController ->
//        route("home") { HomePage(navController = navController) }
//        route("detail/{id}") { DetailPage(navController = navController, arguments = it) }
//    })

    TabNavigation(startDestination = "home", builder = {

    })
}