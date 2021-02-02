package com.example.composenavigation.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController

@Composable
fun TabNavigation(startDestination: String, builder: NavGraphBuilder.(NavHostController) -> Unit) {
    val navController = rememberNavController()
    val navigate: NavOptionsBuilder.() -> Unit = {
        popUpTo = navController.graph.startDestination
        launchSingleTop = true
    }
    Column {
        Column(modifier = Modifier.fillMaxHeight()) {
            NavHost(navController = navController, startDestination = startDestination, builder = {
                builder(navController)
            })
        }
        Row {
            TabItem(label = "Home") { navController.navigate("home", navigate) }
            TabItem(label = "Search") { navController.navigate("detail", navigate) }
        }
    }
}

@Composable
fun tab(navController: NavController, id: String, label: String) {
    val navigate: NavOptionsBuilder.() -> Unit = {
        popUpTo = navController.graph.startDestination
        launchSingleTop = true
    }
    TabItem(label = "Home") { navController.navigate(id, navigate) }
}

@Composable
fun TabItem(label: String, onClick: () -> Unit) {
    Column(Modifier.clickable {

        onClick.invoke()
    }) {
        Text(text = label)
    }
}