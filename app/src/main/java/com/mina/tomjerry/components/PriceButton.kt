package com.mina.tomjerry.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextDecoration.Companion.LineThrough
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mina.tomjerry.R
import com.mina.tomjerry.ui.theme.DarkBlue
import com.mina.tomjerry.ui.theme.JerryStoryButtonBackground
import com.mina.tomjerry.ui.theme.ibmPlexSans

@Composable
fun PriceButton(
    cheeseCount:Int,
    modifier: Modifier = Modifier,
    oldCheeseCount:Int? = null) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = modifier
            .height(30.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(JerryStoryButtonBackground)
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(R.drawable.cheese),
            contentDescription = "cheese",
            tint = DarkBlue,
            modifier = Modifier.size(13.dp)
        )
        if (oldCheeseCount != null) {
            Text(
                text = oldCheeseCount.toString(),
                fontFamily = ibmPlexSans,
                color = DarkBlue,
                fontSize = 12.sp,
                textDecoration = LineThrough,
                modifier = Modifier.padding(start = 4.dp)
            )
        }
        Text(
            text = cheeseCount.toString(),
            fontFamily = ibmPlexSans,
            color = DarkBlue,
            fontSize = 12.sp,
            modifier = Modifier.padding(start = 4.dp)
        )
        Text(
            text = "cheeses",
            fontFamily = ibmPlexSans,
            color = DarkBlue,
            fontSize = 12.sp,
            modifier = Modifier.padding(start = 4.dp)
        )

    }
}
