package com.nzdeveloper009.quotecomposeapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nzdeveloper009.quotecomposeapp.R

@Preview
@Composable
fun QuoteListItem() {
    Card(
        elevation = 4.dp,
        modifier = Modifier
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                imageVector = Icons.Filled.FormatQuote,
                contentDescription = "Quote",
                colorFilter = ColorFilter.tint(Color.White),
                alignment = Alignment.TopStart,
                modifier = Modifier
                    .size(40.dp)
                    .rotate(180F)
                    .background(Color.Black)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Time is the most valuable thing a man can spend.",
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                )
                Box(
                    modifier = Modifier
                        .background(Color(0xFFEEEEEE)) // ARGB (Alpha RGB) FF is alpha
                        .fillMaxWidth(.4f)
                        .height(1.dp)
                )
                Text(
                    text = "Theophrastus",
                    style = MaterialTheme.typography.body2,
                    fontWeight = FontWeight.Thin,
                    modifier = Modifier.padding(top = 4.dp)

                )
            }
        }
    }
}

@Preview
@Composable
fun QuoteDetail() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFffffff),
                        Color(0xFFE3E3E3)
                    )
                )
            )
    ) {
        Card(
            elevation = 4.dp,
            modifier = Modifier.padding(32.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(16.dp, 24.dp)
            ) {
                Image(
                    imageVector = Icons.Filled.FormatQuote,
                    contentDescription = "Quote",
                    modifier = Modifier
                        .size(80.dp)
                        .rotate(180F)
                )
                Text(
                    text = "Time is the most valuable thing a man can spend.",
                    fontFamily = FontFamily(Font(R.font.montserrat_regular)),
                    style = MaterialTheme.typography.h6
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = "Theophrastus",
                    fontFamily = FontFamily(Font(R.font.montserrat_regular)),
                    style = MaterialTheme.typography.subtitle1
                )
            }
        }
    }
}
