package com.owsieman.sdk

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import kotlinx.coroutines.launch


fun main() = application {
//    var secondWindowOpened by remember { mutableStateOf(true) }
//    var apiResponse by remember { mutableStateOf("Waiting...") }
//    val scope = rememberCoroutineScope()
    Window(
        onCloseRequest = ::exitApplication,
        title = "DEA_SDK",
    ) {
        App()
//        if(secondWindowOpened) {
//            Window(
//                onCloseRequest = { secondWindowOpened = false },
//                title = "New Window",
//                state = WindowState(width = 300.dp, height = 600.dp),
//                resizable = false
//            ) {
//                Column(
//                    modifier = Modifier.fillMaxWidth(),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                    Button(onClick = {
//                        scope.launch { apiResponse = ApiService().fetchData() }
//                    }) {
//                        Text(text = "Click me")
//                    }
//                    Spacer(modifier = Modifier.height(12.dp))
//                    Text(text = apiResponse)
//                }
//            }
//        }
    }
}