package com.mina.tomjerry.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mina.tomjerry.R
import com.mina.tomjerry.ui.theme.SearchBarDarkColor
import com.mina.tomjerry.ui.theme.SecondaryDarkTextColor
import com.mina.tomjerry.ui.theme.SecondaryTextColor
import com.mina.tomjerry.ui.theme.ibmPlexSans

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    placeholderText: String = "Search about tom ..."
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .border(
                width = 1.dp,
                color = SearchBarDarkColor,
                shape = RoundedCornerShape(12.dp)
            )
            .background(Color.White)
            .padding(12.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.search_normal),
                contentDescription = "Search Icon",
                tint = SecondaryDarkTextColor,
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = placeholderText,
                color = SecondaryDarkTextColor,
                fontFamily = ibmPlexSans,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }
}
