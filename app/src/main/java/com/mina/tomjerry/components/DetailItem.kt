package com.mina.tomjerry.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mina.tomjerry.ui.theme.DarkBlue
import com.mina.tomjerry.ui.theme.JerryStoryButtonBackground
import com.mina.tomjerry.ui.theme.PrimaryTextColor
import com.mina.tomjerry.ui.theme.SecondaryTextColor
import com.mina.tomjerry.ui.theme.ibmPlexSans

@Composable
fun DetailItem(
    iconRes: Int,
    valueText: String,
    labelText: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .background(JerryStoryButtonBackground)
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            imageVector = ImageVector.vectorResource(iconRes),
            contentDescription = labelText,
            tint = DarkBlue,
            modifier = Modifier.size(32.dp)
        )
        Text(
            text = valueText,
            fontFamily = ibmPlexSans,
            color = PrimaryTextColor,
            fontSize = 14.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier.padding(start = 4.dp)
        )
        Text(
            text = labelText,
            fontFamily = ibmPlexSans,
            color = SecondaryTextColor,
            fontSize = 12.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}