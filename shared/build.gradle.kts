import com.codingfeline.buildkonfig.compiler.FieldSpec

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("com.android.library")
    id("app.cash.sqldelight")
    id("kotlin-parcelize")
    kotlin("plugin.serialization")
    id("com.codingfeline.buildkonfig")
//    id("dev.icerock.mobile.multiplatform-resources")
}

val coroutineVersion: String by project
val dateTimeVersion: String by project
val sqlDelightVersion: String by project
val koinVersion: String by project
val koinComposeVersion: String by project
val mokoMvvmVersion: String by project
val decomposeVersion: String by project
val ktorVersion: String by project
val mokoResourceVersion: String by project

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    androidTarget()

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.material)
                implementation(compose.materialIconsExtended)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutineVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:$dateTimeVersion")

                implementation("com.arkivanov.decompose:decompose:$decomposeVersion")
                implementation("com.arkivanov.decompose:extensions-compose-jetbrains:$decomposeVersion")

                implementation("io.insert-koin:koin-core:$koinVersion")
                implementation("io.insert-koin:koin-compose:$koinComposeVersion")

//                implementation("dev.icerock.moko:resources-compose:$mokoResourceVersion")
                implementation("dev.icerock.moko:mvvm-core:$mokoMvvmVersion")
                implementation("dev.icerock.moko:mvvm-compose:$mokoMvvmVersion")
                implementation("dev.icerock.moko:mvvm-flow:$mokoMvvmVersion")
                implementation("dev.icerock.moko:mvvm-flow-compose:$mokoMvvmVersion")

                // Ktor
                implementation("io.ktor:ktor-client-core:$ktorVersion")
                implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
                implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation("dev.icerock.moko:mvvm-test:$mokoMvvmVersion")
            }
        }
        val androidMain by getting {
            dependencies {
                api("androidx.activity:activity-compose:1.7.2")
                api("androidx.core:core-ktx:1.10.1")

                implementation("app.cash.sqldelight:android-driver:$sqlDelightVersion")
                implementation("io.insert-koin:koin-android:$koinVersion")
                implementation("io.ktor:ktor-client-okhttp:$ktorVersion")
            }
        }

        val iosMain by getting {
            dependencies {
                implementation("app.cash.sqldelight:native-driver:$sqlDelightVersion")
                implementation("io.ktor:ktor-client-darwin:$ktorVersion")
            }
        }
    }
}

// multiplatformResources {
//    multiplatformResourcesPackage =
//        "com.jamshedalamqaderi.cmptemplate.shared"
// }

android {
    namespace = "com.jamshedalamqaderi.cmptemplate.shared"
    compileSdk = 34

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")

    defaultConfig {
        minSdk = 21
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlin {
        jvmToolchain(11)
    }
}

sqldelight {
    databases {
        create("MainDatabase") {
            packageName.set("com.jamshedalamqaderi.cmpteplate.shared.db")
            generateAsync.set(true)
        }
    }
}

buildkonfig {
    packageName = "com.jamshedalamqaderi.cmptemplate.shared.config"

    defaultConfigs {
        buildConfigField(
            FieldSpec.Type.STRING,
            "HOST",
            "https://github.com",
            const = true
        )
    }
}
