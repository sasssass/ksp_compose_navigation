package com.sass.navigationsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sass.navigationsample.ui.ScreenWithArgument
import com.sass.navigationsample.ui.ScreenWithArgumentGraphNode
import com.sass.navigationsample.ui.ScreenWithOptionalArguments
import com.sass.navigationsample.ui.ScreenWithOptionalArgumentsGraphNode
import com.sass.navigationsample.ui.SimpleScreen
import com.sass.navigationsample.ui.SimpleScreenGraphNode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController, startDestination = SimpleScreenGraphNode.route) {
                composable(SimpleScreenGraphNode.route) {
                    SimpleScreen(navController = navController)
                }

                composable(ScreenWithArgumentGraphNode.route) {backStackEntry ->
                    val id = checkNotNull(backStackEntry.arguments?.getString(ScreenWithArgumentGraphNode.ARG_id))
                    val name = checkNotNull(backStackEntry.arguments?.getString(ScreenWithArgumentGraphNode.ARG_name))

                    ScreenWithArgument(navController = navController, id, name)
                }

                composable(ScreenWithOptionalArgumentsGraphNode.route) {backStackEntry ->
                    val id = checkNotNull(backStackEntry.arguments?.getString(ScreenWithOptionalArgumentsGraphNode.ARG_id))
                    val name = checkNotNull(backStackEntry.arguments?.getString(ScreenWithOptionalArgumentsGraphNode.ARG_name))
                    val nickName = backStackEntry.arguments?.getString(ScreenWithOptionalArgumentsGraphNode.ARG_OPTIONAL_nickName)
                    val age = backStackEntry.arguments?.getString(ScreenWithOptionalArgumentsGraphNode.ARG_OPTIONAL_age)
                    ScreenWithOptionalArguments(
                        name = name,
                        id = id,
                        nickName = nickName,
                        age = age
                    )
                }
            }
        }
    }
}
