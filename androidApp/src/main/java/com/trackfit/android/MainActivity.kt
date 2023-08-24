package com.trackfit.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.arkivanov.decompose.defaultComponentContext
import com.jamshedalamqaderi.cmp.App
import com.jamshedalamqaderi.cmp.features.common.domain.services.navigation.NavigationManagerServiceImpl
import com.jamshedalamqaderi.cmp.features.common.domain.services.navigation.Routes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navigationManagerService = NavigationManagerServiceImpl(
            componentContext = defaultComponentContext(),
            routeList = Routes
        )
        setContent {
            App(navigationManagerService)
        }
    }
}
