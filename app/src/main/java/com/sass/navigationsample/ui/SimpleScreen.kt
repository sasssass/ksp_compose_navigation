package com.sass.navigationsample.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.sass.annotation.NavigationNode

@NavigationNode(route = "sample_screen", args = emptyArray(), optionalArgs = emptyArray())
@Composable
fun SimpleScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Button(onClick = {
            navController.navigate(ScreenWithArgumentGraphNode.navigationRoute(
                arg_id = "123", arg_name = "Ali"
            ))
        }) {
            Text(text = "Go To Screen with Arguments")
        }
    }
}