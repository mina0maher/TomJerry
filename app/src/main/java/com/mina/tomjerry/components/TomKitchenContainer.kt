package com.mina.tomjerry.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mina.tomjerry.ui.theme.DarkBlue
import com.mina.tomjerry.ui.theme.PrimaryTextColor
import com.mina.tomjerry.ui.theme.ibmPlexSans


@Composable
fun TomKitchenContainer(
    text: String,
    price: Int,
    modifier: Modifier = Modifier,
    icon: ImageVector = Icons.Filled.Favorite,
    iconTint: Color = DarkBlue,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 32.dp, bottom = 16.dp, start = 16.dp, end = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = text,
                fontFamily = ibmPlexSans,
                color = PrimaryTextColor,
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(8.dp))

            PriceButton(price)
        }


        Icon(
            imageVector = icon,
            contentDescription = "Static Icon",
            tint = iconTint,
            modifier = Modifier.size(24.dp)
        )

    }
}