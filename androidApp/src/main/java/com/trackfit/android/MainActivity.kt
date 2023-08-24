package com.trackfit.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.defaultComponentContext
import com.jamshedalamqaderi.cmp.AppBootstrap
import com.jamshedalamqaderi.cmp.features.common.domain.services.navigation.NavigationManagerServiceImpl
import com.jamshedalamqaderi.cmp.features.common.domain.services.navigation.Routes

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalDecomposeApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navigationManagerService = NavigationManagerServiceImpl(
            componentContext = defaultComponentContext(),
            routeList = Routes
        )
        setContent {
            AppBootstrap(useDarkTheme = isSystemInDarkTheme(), false, navigationManagerService)
        }
    }
}
