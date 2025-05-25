package com.mina.tomjerry.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mina.tomjerry.R
import com.mina.tomjerry.components.IconText
import com.mina.tomjerry.components.TomKitchenContainer
import com.mina.tomjerry.ui.theme.TomKitchenBackground

@Composable
fun TomKitchenScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .background(Color.White)
            .background(TomKitchenBackground)
            .fillMaxSize()
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(R.drawable.tom_kitchen_shape),
            contentDescription = "",
            modifier = Modifier
                .size(width = 384.dp, height = 414.dp)
                .offset(x = (-100).dp, y = (-20).dp)
        )
        Column (modifier = Modifier.padding(top = 40.dp , start = 16.dp)){
            IconText("High tension",R.drawable.ruler)
            Spacer(Modifier.height(8.dp))
            IconText("Shocking Foods",R.drawable.cook)
        }
        Card(
            modifier
                .fillMaxSize()
                .padding(top = 162.dp)
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))) {
                    TomKitchenContainer(
                        text = "Electric Tom pasta",
                        price = 5,
                    )

        }
        Image(
            painter = painterResource(id = R.drawable.food),
            contentDescription = "Plate Icon",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(210.dp, 200.dp)
                .align(Alignment.TopEnd)
                .padding(top = 18.dp, end = 24.dp)
        )
    }
}







@Preview
@Composable
private fun Preview() {
    TomKitchenScreen()
}