/*
 * Copyright (c) 2022. StulSoft
 */

plugins {
    scala
    id("com.stulsoft.pmodule.info.java-library-conventions")

}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.10")
}