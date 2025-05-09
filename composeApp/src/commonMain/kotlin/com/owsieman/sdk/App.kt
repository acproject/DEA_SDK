package com.owsieman.sdk

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import dea_sdk.composeapp.generated.resources.Res
import dea_sdk.composeapp.generated.resources.compose_multiplatform
import com.owsieman.sdk.screen.ExampleScreen
import com.owsieman.sdk.screen.HomeScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        Navigator(ExampleScreen()) { navigator ->
            SlideTransition(navigator)

        }
    }
}