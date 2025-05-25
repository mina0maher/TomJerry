package com.mina.tomjerry.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mina.tomjerry.ui.theme.DarkBlue
import com.mina.tomjerry.ui.theme.JerryStoryButtonBackground
import com.mina.tomjerry.ui.theme.SecondaryTextColor
import com.mina.tomjerry.ui.theme.ibmPlexSans

@Composable
fun MethodItem(
    text: String,
    number: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(36.dp)
                .padding(start = 8.dp)
                .clip(RoundedCornerShape(12.dp)),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 36.dp, end = 16.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = text,
                    fontFamily = ibmPlexSans,
                    color = SecondaryTextColor,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Light,
                )
            }
        }

        Box(
            modifier = Modifier
                .size(36.dp)
                .align(Alignment.CenterStart)
                .clip(CircleShape)
                .border(
                    width = 1.dp,
                    color = JerryStoryButtonBackground,
                    shape = CircleShape
                )
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = number.toString(),
                fontFamily = ibmPlexSans,
                fontWeight = FontWeight.Medium,
                color = DarkBlue,
                fontSize = 12.sp,
            )
        }
    }
}