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

    // 设置系统UI颜色（具体实现在平台模块）
    setSystemUIColors(
        color = colors.background,
        darkIcons = !isSystemInDarkTheme()
    )

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
