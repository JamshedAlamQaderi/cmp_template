pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    plugins {
        val kotlinVersion = extra["kotlin.version"] as String
        val agpVersion = extra["agp.version"] as String
        val composeVersion = extra["compose.version"] as String
        val mokoResourceVersion = extra["mokoResourceVersion"] as String
        val ktlintVersion = extra["ktlintVersion"] as String
        val sqlDelightVersion = extra["sqlDelightVersion"] as String
        val buildKonfigVersion = extra["buildKonfigVersion"] as String

        kotlin("multiplatform").version(kotlinVersion)
        kotlin("plugin.serialization").version(kotlinVersion)
        id("org.jetbrains.compose").version(composeVersion)
        id("com.android.application").version(agpVersion)
        id("com.android.library").version(agpVersion)
        id("org.jlleitschuh.gradle.ktlint").version(ktlintVersion)
        id("app.cash.sqldelight").version(sqlDelightVersion)
        id("com.codingfeline.buildkonfig").version(buildKonfigVersion)
        id("dev.icerock.mobile.multiplatform-resources").version(mokoResourceVersion)
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "CMP_TEMPLATE"

include(":androidApp")
include(":shared")
