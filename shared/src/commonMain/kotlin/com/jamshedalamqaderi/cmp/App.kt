package com.jamshedalamqaderi.cmp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.IntSize
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.plus
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.scale
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.jamshedalamqaderi.cmp.features.common.domain.services.navigation.NavigationManagerService
import com.jamshedalamqaderi.cmp.features.common.presentation.AdaptiveDesignLayout
import com.jamshedalamqaderi.cmp.features.common.presentation.Center
import com.jamshedalamqaderi.cmp.theme.AppTheme
import org.koin.compose.KoinApplication

@Composable
fun App(navigationManagerService: NavigationManagerService) {
    KoinApplication(application = {
        modules()
    }) {
        AppTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background,
            ) {
                AdaptiveDesignLayout(IntSize(360, 688)) {
                    Children(
                        navigationManagerService.stack,
                        modifier = Modifier.fillMaxSize(),
                        animation = stackAnimation(fade() + scale())
                    ) {
                        navigationManagerService
                            .findRouteByNavigationRouter(it.instance)
                            ?.content?.invoke(it.instance)
                            ?: Center {
                                Text("Screen not found for path: ${it.instance.path}")
                            }
                    }
                }
            }
        }
    }
}
