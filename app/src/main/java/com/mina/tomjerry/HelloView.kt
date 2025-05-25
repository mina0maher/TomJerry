package com.mina.tomjerry

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HelloView(name:String) {
    Text("Hello $name", color =  Color.Red)
}

@Preview
@Composable
private fun Preview() {
    HelloView(name = "Test")
}