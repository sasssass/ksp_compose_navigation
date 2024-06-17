package com.sass.navigationsample.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.sass.annotation.NavigationNode

@NavigationNode(route = "screen_with_argument", args = arrayOf("id", "name"), optionalArgs = emptyArray())
@Composable
fun ScreenWithArgument(navController: NavController, id: String, name: String) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "You're $name with id as $id")
        Button(onClick = {
            navController.navigate(ScreenWithOptionalArgumentsGraphNode.navigationRoute(
                arg_id = id, arg_name = name, optionalArg_nickName = "Sadegh", optionalArg_age = null
            ))
        }) {
            Text(text = "Go To Screen with Optional Arguments")
        }
    }
}