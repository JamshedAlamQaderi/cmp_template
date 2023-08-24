plugins {
    kotlin("multiplatform").apply(false)
    kotlin("plugin.serialization").apply(false)
    id("org.jetbrains.compose").apply(false)
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    id("org.jlleitschuh.gradle.ktlint").apply(false)
    id("app.cash.sqldelight").apply(false)
    id("com.codingfeline.buildkonfig").apply(false)
    id("dev.icerock.mobile.multiplatform-resources").apply(false)
}

allprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint")

    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
