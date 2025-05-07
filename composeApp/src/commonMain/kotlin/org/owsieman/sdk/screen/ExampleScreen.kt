package org.owsieman.sdk.screen

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen

/**
 * @author acproject@qq.com
 * @date 2025/5/7 22:51
 */

class ExampleScreen: Screen {
    @Composable
    override fun Content() {
        ScrollableList()
    }
}

@Composable
fun ScrollableList() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 10.dp)
    ) {
        val verticalScroll = rememberScrollState(0)
        val horizontalScroll = rememberScrollState(0)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(verticalScroll)
                .horizontalScroll(horizontalScroll)
                .fillMaxWidth()
                .padding(end = 12.dp, bottom = 12.dp)
        ) {
            for (item in 1..30) {
                Text(
                    modifier = Modifier.padding(all = 12.dp),
                    text = "This is the item number: #$item"
                )
            }

            VerticalScrollbar(
                modifier = Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
                adapter = rememberScrollbarAdapter(verticalScroll)
            )
            HorizontalScrollbar(
                modifier = Modifier.align(Alignment.BottomStart)
                    .fillMaxHeight()
                    .padding(end = 12.dp),
                adapter = rememberScrollbarAdapter(verticalScroll)
            )
        }
    }
}