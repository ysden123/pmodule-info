/*
 * Copyright (c) 2022. StulSoft
 */

plugins {
    id("com.stulsoft.pmodule.info.java-application-conventions")
    id("extra-java-module-info")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":my-lib"))
}

application {
    // Define the main class for the application.
    mainClass.set("com.stulsoft.pmodule.info.app.App")
}

extraJavaModuleInfo {
    automaticModule("my-lib.jar", "com.stulsoft.pmodule.info.lib")
}
