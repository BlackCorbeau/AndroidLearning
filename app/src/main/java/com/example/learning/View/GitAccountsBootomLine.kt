package com.example.learning.View

import android.view.textclassifier.TextLinks
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.unit.dp
import com.example.learning.R

@Composable
fun GitAccountsRow(){
    val height = 105.dp
    Row(modifier = Modifier
        .fillMaxWidth(), 
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically){
        Card(
            modifier = Modifier
                .size(width = 200.dp, height = height)
                .fillMaxHeight()
                .padding(5.dp, 0.dp),
            elevation = CardDefaults.cardElevation(5.dp),
        ) {
            Column( modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = painterResource(
                    R.drawable.github),
                    contentDescription = "Img1",
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape))
                Text(
                    buildAnnotatedString {
                        withLink(
                            LinkAnnotation.Url(
                                "https://github.com/BlackCorbeau",
                                TextLinkStyles(style = SpanStyle(color = Color.Blue))
                            )
                        ) {
                            append("Main Git Account")
                        }
                    },
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
        Card(
            modifier = Modifier.size(width = 200.dp, height = height),
            elevation = CardDefaults.cardElevation(5.dp)
        ) {
            Column( modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = painterResource(
                    R.drawable.github),
                    contentDescription = "Img1",
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape))
                Text(
                    buildAnnotatedString {
                        withLink(
                            LinkAnnotation.Url(
                                "https://github.com/RemizovKL",
                                TextLinkStyles(style = SpanStyle(color = Color.Blue))
                            )
                        ) {
                            append("Freelance git account")
                        }
                    },
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}