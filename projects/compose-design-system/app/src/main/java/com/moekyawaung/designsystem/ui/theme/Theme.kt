package com.moekyawaung.designsystem.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val GreenPrimary = Color(0xFF00FF85)
val PurpleAccent = Color(0xFF9F7AEA)

private val DarkColorScheme = darkColorScheme(
    primary = GreenPrimary,
    secondary = PurpleAccent,
    background = Color(0xFF0A0A0A),
    surface = Color(0xFF111111),
    onPrimary = Color.Black,
    onBackground = Color.White
)

@Composable
fun SeniorDesignSystemTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
        content = content
    )
}

