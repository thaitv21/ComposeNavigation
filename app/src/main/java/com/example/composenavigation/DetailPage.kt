package com.example.composenavigation

import android.os.Bundle
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Preview(showSystemUi = true, device = Devices.PIXEL_4_XL)
@Composable
fun DetailPagePreview() {
    val navController = rememberNavController()
    DetailPage(navController = navController, arguments = null)
}

@Composable
fun DetailPage(navController: NavController, arguments: Bundle?) {
    Column {
        Button(onClick = { navController.popBackStack() }) {
            Text(text = "back")
        }
        Text(text = "Detail")
    }
}