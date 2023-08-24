package com.jamshedalamqaderi.cmp.features.common.domain.services.navigation

import com.arkivanov.essenty.parcelable.Parcelable
import com.jamshedalamqaderi.cmp.features.home.presentation.HomeScreen


sealed class NavigationRouter(val path: String, val initial: Boolean = false) :
    Parcelable {
    data object Home : NavigationRouter("home", true)
}

val Routes = listOf(
    Route(NavigationRouter.Home) { HomeScreen() },
)