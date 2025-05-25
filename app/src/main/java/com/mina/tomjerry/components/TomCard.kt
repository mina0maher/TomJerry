package com.mina.tomjerry.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mina.tomjerry.R
import com.mina.tomjerry.models.TomCardData
import com.mina.tomjerry.ui.theme.DarkBlue
import com.mina.tomjerry.ui.theme.PrimaryTextColor
import com.mina.tomjerry.ui.theme.SecondaryTextColor
import com.mina.tomjerry.ui.theme.ibmPlexSans

@Composable
fun TomCard(data: TomCardData) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(240.dp)
    ) {

        Card(
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .align(Alignment.BottomCenter)

                .fillMaxWidth()
                .height(220.dp)
                .background(Color.White)


        ) {

            Column(
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ) {

                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = data.title,
                    color = PrimaryTextColor,
                    fontFamily = ibmPlexSans,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    data.subtitle,
                    color = SecondaryTextColor,
                    fontFamily = ibmPlexSans,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    PriceButton(cheeseCount = data.cheeseCount,
                        oldCheeseCount = data.oldCheeseCount,
                        modifier = Modifier.weight(1f))
                    Spacer(Modifier.width(8.dp))

                    Box(
                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .border(
                                width = 1.dp,
                                color = DarkBlue,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .background(Color.Transparent),
                        contentAlignment = Alignment.Center
                    ) {

                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.add_to_card),
                            contentDescription = "Notifications",
                            tint = DarkBlue,
                            modifier = Modifier.size(15.dp)
                        )
                    }
                }
            }
        }
        Image(
            painter = painterResource(id = data.tomIcon),
            contentDescription = "Tom Icon",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.TopCenter)
        )

    }
}



@Preview(showBackground = true)
@Composable
fun PreviewTomStore() {
    TomCard(TomCardData("Sport Tom", "He runs 1 mile... trips on the last.", R.drawable.sport_tom,8,5))
}
