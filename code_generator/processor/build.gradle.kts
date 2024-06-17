plugins {
    alias(libs.plugins.jetbrainsKotlinJvm)
    alias(libs.plugins.ksp)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(project(":code_generator:annotation"))
    implementation(libs.symbol.processing)
    implementation(libs.kotlinpoet)
}