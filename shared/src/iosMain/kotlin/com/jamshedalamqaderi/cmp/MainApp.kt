package com.jamshedalamqaderi.cmp

import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import com.jamshedalamqaderi.cmp.features.common.domain.services.navigation.NavigationManagerServiceImpl
import com.jamshedalamqaderi.cmp.features.common.domain.services.navigation.Routes
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

@OptIn(ExperimentalDecomposeApi::class)
fun MainApp() = ComposeUIViewController {
    val isDarkTheme =
        UIScreen.mainScreen.traitCollection.userInterfaceStyle == UIUserInterfaceStyle.UIUserInterfaceStyleDark
    val lifecycleRegistry = LifecycleRegistry()
    val navigationManagerService = NavigationManagerServiceImpl(
        componentContext = DefaultComponentContext(lifecycleRegistry),
        routeList = Routes
    )
    AppBootstrap(isDarkTheme, false, navigationManagerService)
}
