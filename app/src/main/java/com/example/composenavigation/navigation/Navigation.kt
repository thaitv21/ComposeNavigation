package com.example.composenavigation

import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.route(path: String, content: @Composable (Bundle?) -> Unit) {
    composable(path) { content(it.arguments) }
}