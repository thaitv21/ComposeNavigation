package com.example.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun StackNavigation(startDestination: String, builder: NavGraphBuilder.(NavHostController) -> Unit) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination, builder = {
        builder(navController)
    })
}