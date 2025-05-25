package com.mina.tomjerry.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mina.tomjerry.R
import com.mina.tomjerry.ui.theme.DarkBlue
import com.mina.tomjerry.ui.theme.NotificationStrokeColor

@Composable
fun NotificationIcon(
    notificationCount: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(40.dp),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(12.dp))
                .border(width = 1.dp, color = NotificationStrokeColor, shape = RoundedCornerShape(12.dp))
                .background(Color.Transparent)
        )

        Icon(
            imageVector = ImageVector.vectorResource(R.drawable.notification),
            contentDescription = "Notifications",
            tint = Color.Black,
            modifier = Modifier.size(20.dp)
        )

        if (notificationCount > 0) {
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .offset(x = 1.dp, y = (-4).dp)
                    .size(14.dp)
                    .background(DarkBlue, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = if (notificationCount > 99) "99+" else notificationCount.toString(),
                    color = Color.White,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    NotificationIcon(3)
}