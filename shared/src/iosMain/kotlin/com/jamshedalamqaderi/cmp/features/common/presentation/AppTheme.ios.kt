package com.jamshedalamqaderi.cmp.features.common.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.jamshedalamqaderi.cmp.ui.theme.DarkColorScheme
import com.jamshedalamqaderi.cmp.ui.theme.LightColorScheme
import com.jamshedalamqaderi.cmp.ui.theme.Typography

@Composable
actual fun AppTheme(
    useDarkTheme: Boolean,
    useDynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (useDarkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}
