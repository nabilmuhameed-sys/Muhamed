package com.mostarid.coreui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = androidx.compose.ui.graphics.Color(0xFF0EA5A4),
    secondary = androidx.compose.ui.graphics.Color(0xFF4A5568)
)

private val DarkColors = darkColorScheme(
    primary = androidx.compose.ui.graphics.Color(0xFF0891B2)
)

@Composable
fun MostaridTheme(content: @Composable () -> Unit) {
    val colors = LightColors
    MaterialTheme(
        colorScheme = colors,
        typography = androidx.compose.material3.Typography(),
        content = content
    )
}
