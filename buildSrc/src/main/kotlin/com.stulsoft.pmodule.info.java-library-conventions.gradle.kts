/*
 * Copyright (c) 2022. StulSoft
 */

plugins {
    // Apply the common convention plugin for shared build configuration between library and application projects.
    id("com.stulsoft.pmodule.info.java-common-conventions")

    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}
