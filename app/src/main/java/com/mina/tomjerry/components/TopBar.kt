package com.mina.tomjerry.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mina.tomjerry.ui.theme.PrimaryTextColor
import com.mina.tomjerry.ui.theme.SecondaryTextColor
import com.mina.tomjerry.ui.theme.ibmPlexSans

@Composable
fun TopBar(
    imageProfile:Painter,
    name:String,
    message:String,
    notificationCount:Int,
    modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = imageProfile,
            contentDescription = "profile picture",
            modifier = modifier.clip(shape = RoundedCornerShape(12.dp)).size(48.dp)
        )
        Column (modifier = Modifier
            .padding(horizontal = 8.dp),
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text = "Hi, $name \uD83D\uDC4B\uD83C\uDFFB",
                color = PrimaryTextColor,
                fontFamily = ibmPlexSans,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(text = message,
                color = SecondaryTextColor,
                fontFamily = ibmPlexSans,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        NotificationIcon(notificationCount )
    }
}