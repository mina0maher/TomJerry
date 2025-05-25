package com.mina.tomjerry.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mina.tomjerry.R
import com.mina.tomjerry.components.AccountHeader
import com.mina.tomjerry.components.SettingsSection
import com.mina.tomjerry.components.StatusItem
import com.mina.tomjerry.ui.theme.DarkBlue
import com.mina.tomjerry.ui.theme.DefaultBackground

@Composable
fun TomAccountScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(Color.White)
            .background(DarkBlue)
            .fillMaxSize()
    ) {
        AccountHeader(
            painterResource(R.drawable.jerry_profile),
            "Tom",
            "specializes in failure!",
            "Edit foolishness",
            Modifier.align(Alignment.TopCenter)
        )

        Box(
            modifier = Modifier
                .offset(x = 100.dp, y = (-140).dp)
                .size(width = 600.dp, height = 220.dp)
                .graphicsLayer(rotationZ = 25f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color.White.copy(alpha = 0.3f),
                            Color.Transparent
                        ),
                        start = Offset.Zero,
                        end = Offset.Infinite
                    )
                )
        )

        Box(
            modifier = Modifier
                .offset(x = (-100).dp, y = (-150).dp)
                .size(width = 600.dp, height = 250.dp)
                .graphicsLayer(rotationZ = -30f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color.White.copy(alpha = 0.3f),
                            Color.Transparent
                        ),
                        start = Offset.Zero,
                        end = Offset.Infinite
                    )
                )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 162.dp)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)),
                shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
                colors = CardDefaults.cardColors(containerColor = DefaultBackground)
            ) {
                Column(
                    modifier = Modifier
                        .padding(vertical = 24.dp, horizontal = 16.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    StatsGrid()
                    Spacer(Modifier.height(24.dp))
                    SettingsSection(
                        "Tom Settings",
                        items = listOf(
                            ImageVector.vectorResource(R.drawable.bed) to "Change sleeping place",
                            ImageVector.vectorResource(R.drawable.cat) to "Meow settings",
                            ImageVector.vectorResource(R.drawable.fridge) to "Password to open the fridge"
                        )
                    )
                    Spacer(Modifier.height(6.dp))
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(Color(0x14001A1F))
                    )
                    Spacer(Modifier.height(6.dp))
                    SettingsSection(
                        "His favorite foods",
                        items = listOf(
                            ImageVector.vectorResource(R.drawable.alert) to "Mouses",
                            ImageVector.vectorResource(R.drawable.hamburger) to "Last stolen meal",
                            ImageVector.vectorResource(R.drawable.sleeping) to "Change sleep mood"
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun StatsGrid(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            StatusItem(
                icon = ImageVector.vectorResource(R.drawable.deaths),
                value = "2M 12K",
                label = "No. of quarrels",
                backgroundColor = Color(0xFFD5E8F6),
                iconTint = Color(0xFF10517B),
                modifier = Modifier.weight(1f)
            )
            StatusItem(
                icon = ImageVector.vectorResource(R.drawable.workout_run),
                value = "+500 h",
                label = "Chase time",
                backgroundColor = Color(0xFFE1F2DC),
                iconTint = Color(0xFF3E7F3E),
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            StatusItem(
                icon = ImageVector.vectorResource(R.drawable.sad),
                value = "2M 12K",
                label = "Hunting times",
                backgroundColor = Color(0xFFF9D9E1),
                iconTint = Color(0xFFA12752),
                modifier = Modifier.weight(1f)
            )
            StatusItem(
                icon = ImageVector.vectorResource(R.drawable.heartbreak),
                value = "3M 7K",
                label = "Heartbroken",
                backgroundColor = Color(0xFFF8ECD6),
                iconTint = Color(0xFFCFA243),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    TomAccountScreen()
}
