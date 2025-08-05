package com.example.learning.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.learning.Model.Tecnologies
import com.example.learning.R
import com.example.learning.ui.theme.TechnologiesBox

@Composable
fun TechnologiesList(){
    Card(modifier = Modifier
        .size(200.dp),
        elevation = CardDefaults.cardElevation(5.dp)) {
        LazyColumn {
            itemsIndexed(
                mutableListOf<Tecnologies>(
                    Tecnologies(R.drawable.c, "C++", "Programming"),
                    Tecnologies(R.drawable.kotlin, "Kotlin", "Programming"),
                    Tecnologies(R.drawable.docker, "Docker", "Ci/Cd"),
                    Tecnologies(R.drawable.kuber, "Kubernates", "Ci/Cd"),
                    Tecnologies(R.drawable.git, "Git", "Version Control"),
                    Tecnologies(R.drawable.github, "GitHub", "Version Control"),
                )
            ){ _, item ->
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .clip(RoundedCornerShape(15.dp))
                    ){
                    Row(modifier = Modifier.padding(5.dp)) {
                    Image(painter = painterResource(id = item.imageId),
                        contentDescription = "Technologia Image",
                        modifier = Modifier.size(50.dp)
                            .clip(CircleShape))
                    Column {
                        Text(item.Name, fontWeight = FontWeight.Bold)
                        Text(item.Atribut, fontStyle = FontStyle.Italic)
                        }
                    }
                }

            }
        }
    }
}