package com.mina.tomjerry.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mina.tomjerry.R
import com.mina.tomjerry.ui.theme.DarkBlue
import com.mina.tomjerry.ui.theme.LightBlue
import com.mina.tomjerry.ui.theme.ibmPlexSans

@Composable
fun PromoBanner(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier,
    imageModifier: Modifier = Modifier,
    imageResId: Int = R.drawable.tom,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(bottomEnd = 16.dp))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(92.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(DarkBlue, LightBlue),
                        start = Offset.Zero,
                        end = Offset.Infinite
                    )
                )
                .align(Alignment.BottomCenter)
        ) {
            Box(
                modifier = Modifier
                    .size(width = 190.dp, height = 163.dp)
                    .offset(x = 290.14.dp, y = (-20).dp)
                    .graphicsLayer { rotationZ = 150f }
                    .background(Color.White.copy(alpha = 0.04f), shape = CircleShape)
            )

            Box(
                modifier = Modifier
                    .size(width = 182.dp, height = 160.dp)
                    .offset(x = 298.27.dp, y = (-20).dp)
                    .graphicsLayer { rotationZ = 150f }
                    .background(Color.White.copy(alpha = 0.04f), shape = CircleShape)
            )

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = title,
                        fontFamily = ibmPlexSans,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        maxLines = 2
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = subtitle,
                        fontFamily = ibmPlexSans,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White.copy(alpha = 0.8f),
                        maxLines = 2
                    )
                }
            }
        }

        Image(
            painter = painterResource(id = imageResId),
            contentDescription = "Promo image",
            contentScale = ContentScale.Crop,
            modifier = imageModifier
                .align(Alignment.TopEnd)
                .offset(x = 30.dp, y = 0.dp)
                .size(width = 130.dp, height = 110.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    PromoBanner("Buy 1 Tom and get 2 for free","Adopt Tom! (Free Fail-Free Guarantee)")
}

