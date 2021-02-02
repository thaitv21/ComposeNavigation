package com.example.composenavigation

import android.os.Bundle
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController

@Composable
@Preview(showSystemUi = true, device = Devices.PIXEL_4_XL)
fun HomePagePreview() {
    val navController = rememberNavController()
    HomePage(navController = navController)
}

@Composable
fun HomePage(navController: NavController) {

    val onNext = {
        navController.navigate("detail/1")
    }

    Column {
        BasicText(text = "hihi")
        Button(onClick = onNext) {
            Text(text = "Click me!")
        }
    }
}

