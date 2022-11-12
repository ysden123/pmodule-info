/*
 * Copyright (c) 2022. StulSoft
 */

plugins {
    // Support convention plugins written in Kotlin. Convention plugins are build scripts in 'src/main' that automatically become available as plugins in the main build.
    `kotlin-dsl`
}

repositories {
    // Use the plugin portal to apply community plugins in convention plugins.
    gradlePluginPortal()
}

dependencies {
    implementation("org.ow2.asm:asm:8.0.1")
}

gradlePlugin {
    plugins {
        // here we register our plugin with an ID
        register("extra-java-module-info") {
            id = "extra-java-module-info"
            implementationClass = "com.stulsoft.gradle.transform.javamodules.ExtraModuleInfoPlugin"
        }
    }
}