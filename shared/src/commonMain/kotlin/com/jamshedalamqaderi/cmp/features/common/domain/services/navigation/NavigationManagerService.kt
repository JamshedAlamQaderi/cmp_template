package com.jamshedalamqaderi.cmp.features.common.domain.services.navigation

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

interface NavigationManagerService : NavigationService {
    val stack: Value<ChildStack<*, NavigationRouter>>

    fun findRouteByNavigationRouter(router: NavigationRouter): Route?
}

sealed interface DeepLink {
    data object None : DeepLink
    class Web(val path: String) : DeepLink
}

data class Route(
    val router: NavigationRouter,
    val content: @Composable (NavigationRouter) -> Unit = {}
)
