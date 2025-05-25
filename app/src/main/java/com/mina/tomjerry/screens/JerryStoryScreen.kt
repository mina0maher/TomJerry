package com.mina.tomjerry.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mina.tomjerry.R
import com.mina.tomjerry.components.PromoBanner
import com.mina.tomjerry.components.SearchBarWithFilters
import com.mina.tomjerry.components.TomCard
import com.mina.tomjerry.components.TopBar
import com.mina.tomjerry.ui.theme.DarkBlue
import com.mina.tomjerry.ui.theme.PrimaryTextColor
import com.mina.tomjerry.ui.theme.ibmPlexSans
import com.mina.tomjerry.models.TomCardData

@Composable
fun JerryStoryScreen(modifier: Modifier=Modifier) {
    val cards = remember {
        listOf(
            TomCardData("Sport Tom", "He runs 1 mile... trips on the last.",R.drawable.sport_tom, 3,5),
            TomCardData("Tom the lover", "He loves the lovely... but the lovely don’t love him.",R.drawable.tom_the_lover ,5),
            TomCardData("Tom the bomb", "He blows himself up before Jerry can catch him.",R.drawable.tom_the_lover, 10),
            TomCardData("Spy Tom", "Disguises himself as a table.",R.drawable.spy_tom, 12),
            TomCardData("Frozen Tom", "He tries chasing Jerry... but freezes after the first look.",R.drawable.frozen_tom, 6),
            TomCardData("Sleeping Tom", "He is always sleepy. He can sleep even in the war.",R.drawable.sleeping_tom, 9)
        )
    }
    Column(modifier = modifier
        .fillMaxSize()
        .padding(16.dp)) {
        TopBar( imageProfile = painterResource(R.drawable.profile_sample),
            name = "Jerry",
            message = "Which Tom do you want to buy?",
            notificationCount = 3
            )
        Spacer(modifier = Modifier.height(8.dp))
        SearchBarWithFilters()
        Spacer(modifier = Modifier.height(8.dp))
        PromoBanner("Buy 1 Tom and get 2 for free","Adopt Tom! (Free Fail-Free Guarantee)")
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 24.dp)
        ) {
            Text(
                text = "Cheap tom section",
                color = PrimaryTextColor,
                fontFamily = ibmPlexSans,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "View all ➡",
                color = DarkBlue,
                fontFamily = ibmPlexSans,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Spacer(modifier = Modifier.height(8.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.height(1000.dp),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(cards) { card ->
                TomCard(card)
            }
        }
    }
}









@Preview(showBackground = true)
@Composable
private fun Preview() {
    JerryStoryScreen()
}