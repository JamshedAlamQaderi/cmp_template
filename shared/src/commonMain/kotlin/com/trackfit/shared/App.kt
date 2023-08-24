package com.trackfit.shared

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import kotlin.native.concurrent.ThreadLocal

@Composable
fun App() {
    TrackFitTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background,
        ) {
            AdaptiveDesignLayout(IntSize(360, 688)) {
                DemoPage()
            }
        }
    }
}

@ThreadLocal
private object AdaptiveScreenSize {
    var widthMultiplier: Float = 1F
    var heightMultiplier: Float = 1F
    var density: Float = 1f
}

val Int.w
    get() = ((AdaptiveScreenSize.widthMultiplier * this) / AdaptiveScreenSize.density).dp

val Int.h
    get() = ((AdaptiveScreenSize.heightMultiplier * this) / AdaptiveScreenSize.density).dp

@Composable
fun AdaptiveDesignLayout(designSize: IntSize, content: @Composable () -> Unit) {
    val size = remember { mutableStateOf(IntSize.Zero) }
    val density = LocalDensity.current.density
    Box(Modifier
        .fillMaxSize()
        .onGloballyPositioned { coordinates ->
            val displaySize = coordinates.size
            AdaptiveScreenSize.widthMultiplier =
                displaySize.width.toFloat() / designSize.width
            AdaptiveScreenSize.heightMultiplier =
                displaySize.height.toFloat() / designSize.height
            AdaptiveScreenSize.density = density
            size.value = displaySize
        }
    )
    if (size.value != IntSize.Zero) {
        content.invoke()
    }
}
