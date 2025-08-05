package com.example.learning.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learning.R

@Composable
fun InformBar() {
    val likes = remember { mutableStateOf(0) }
    Card(modifier = Modifier
            .fillMaxWidth()
            .offset(0.dp, 40.dp)
            .wrapContentHeight()
            .padding(5.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Row(modifier = Modifier.padding(5.dp)) {
            Box{
                Image(painter = painterResource(id = R.drawable.image),
                    contentDescription = "My Photo",
                    contentScale = ContentScale.Inside,
                    modifier = Modifier
                        .padding(5.dp)
                )
            }
            Column(modifier = Modifier.offset(0.dp, 30.dp)) {
                Text("Ремизов Кирилл Львович", fontFamily = FontFamily.SansSerif, fontSize = 17.sp, fontWeight = FontWeight.Bold )
                Text("Kotlin developer and Ci/Cd ingeneer", fontFamily = FontFamily.SansSerif, fontSize = 12.sp, fontStyle = FontStyle.Italic)
            }
            Box(modifier = Modifier.offset(0.dp, 17.dp)
                    .padding(10.dp)
                    .clickable(){likes.value++},
                contentAlignment = Alignment.Center){
                Image(painter = painterResource(R.drawable.like),
                    contentDescription = "Like",
                    contentScale = ContentScale.Inside,
                    modifier = Modifier.size(30.dp))
                Text("${likes.value}", modifier = Modifier.offset(0.dp, 3.dp))
            }
        }
    }
}