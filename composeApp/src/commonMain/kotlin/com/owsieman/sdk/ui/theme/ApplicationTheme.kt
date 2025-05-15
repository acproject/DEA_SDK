package com.owsieman.sdk.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

// 自定义主题类
@Composable
fun ApplicationTheme (
    drakTheme:Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
){
    val colors = if (drakTheme) DarkColorPalette else LightColorPalette
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = !isSystemInDarkTheme()

    // 设置系统UI颜色
    systemUiController.setSystemBarsColor(
        color = colors.background,
        darkIcons = useDarkIcons
    )

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )

}