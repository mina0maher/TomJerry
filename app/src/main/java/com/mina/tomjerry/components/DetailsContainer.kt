package com.mina.tomjerry.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mina.tomjerry.R
import com.mina.tomjerry.ui.theme.PrimaryTextColor
import com.mina.tomjerry.ui.theme.ibmPlexSans

@Composable
fun DetailsContainer(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth().padding(16.dp)) {
        Text(
            text = "Details",
            fontFamily = ibmPlexSans,
            color = PrimaryTextColor,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.Top
        ) {
            DetailItem(
                iconRes = R.drawable.temperature,
                valueText = "1000v",
                labelText = "Temperature",
                modifier = Modifier.weight(1f)
            )

            DetailItem(
                iconRes = R.drawable.timer,
                valueText = "3 Sparks",
                labelText = "Time",
                modifier = Modifier.weight(1f)
            )

            DetailItem(
                iconRes = R.drawable.deaths,
                valueText = "1M 12K",
                labelText = "No. of deaths",
                modifier = Modifier.weight(1f)
            )
        }
    }
}