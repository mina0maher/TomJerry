package com.mina.tomjerry.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mina.tomjerry.R
import com.mina.tomjerry.ui.theme.ibmPlexSans

@Composable
fun IconText(
    text: String,
    @DrawableRes iconRes: Int,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    iconSize: Dp = 20.dp,
    iconTint: Color = Color.White,
    textColor: Color = Color.White,
    fontSize: TextUnit = 16.sp,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(iconRes),
            contentDescription = contentDescription,
            tint = iconTint,
            modifier = Modifier.size(iconSize)
        )

        Text(
            text = text,
            fontFamily = ibmPlexSans,
            color = textColor,
            fontSize = fontSize,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}


@Preview
@Composable
private fun Preview() {
    IconText("hello world",R.drawable.cook)
}