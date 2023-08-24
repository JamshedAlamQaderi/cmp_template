package com.jamshedalamqaderi.cmp

import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import com.jamshedalamqaderi.cmp.features.common.domain.services.navigation.NavigationManagerServiceImpl
import com.jamshedalamqaderi.cmp.features.common.domain.services.navigation.Routes
import org.lighthousegames.logging.logging
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

val logger = logging("MainApp")

@OptIn(ExperimentalDecomposeApi::class)
fun MainApp(lifecycleRegistry: LifecycleRegistry) = ComposeUIViewController {
    val isDarkTheme =
        UIScreen.mainScreen.traitCollection.userInterfaceStyle == UIUserInterfaceStyle.UIUserInterfaceStyleDark
    val navigationManagerService = NavigationManagerServiceImpl(
        componentContext = DefaultComponentContext(lifecycleRegistry),
        routeList = Routes
    )
    AppBootstrap(isDarkTheme, false, navigationManagerService)
}
