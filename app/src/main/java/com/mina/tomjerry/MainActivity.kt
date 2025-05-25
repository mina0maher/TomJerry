package com.mina.tomjerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mina.tomjerry.screens.JerryStoryScreen
import com.mina.tomjerry.screens.TomAccountScreen
import com.mina.tomjerry.screens.TomKitchenScreen
import com.mina.tomjerry.ui.theme.TomJerryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    JerryStoryScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
//                    TomKitchenScreen(modifier = Modifier.padding(innerPadding))
//                    TomAccountScreen(modifier = Modifier.padding(innerPadding))
                }
            
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TomJerryTheme {
        Greeting("Android")
    }
}