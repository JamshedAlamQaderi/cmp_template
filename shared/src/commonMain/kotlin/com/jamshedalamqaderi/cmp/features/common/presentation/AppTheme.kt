package com.jamshedalamqaderi.cmp.features.common.presentation

import androidx.compose.runtime.Composable

@Composable
expect fun AppTheme(
    useDarkTheme: Boolean,
    useDynamicColor: Boolean,
    content: @Composable () -> Unit
)