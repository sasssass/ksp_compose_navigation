package com.sass.navigationsample.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sass.annotation.NavigationNode

@NavigationNode(route = "screen_with_optional_arguments", args = arrayOf("id", "name"),
    optionalArgs = arrayOf("age","nickName")
)
@Composable
fun ScreenWithOptionalArguments(
    id: String,
    name: String,
    nickName: String?,
    age: String?
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "OK, you're $name with id as $name, your nick name is ${nickName?:"Undefined"}, and your age is ${age?:"Undefined"}")
    }
}