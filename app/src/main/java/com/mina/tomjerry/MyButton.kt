package com.mina.tomjerry

import android.service.autofill.OnClickAction
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyButton(onClickAction: () -> Unit) {
    Button(onClick=onClickAction){
        HelloView("hello")
    }
}

@Preview
@Composable
private fun Preview() {
    MyButton {  }
}