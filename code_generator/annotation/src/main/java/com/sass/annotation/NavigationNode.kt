package com.sass.annotation


@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class NavigationNode(
    val route: String,
    val args: Array<String>,
    val optionalArgs: Array<String>
)
