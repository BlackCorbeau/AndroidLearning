package com.example.learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learning.ui.theme.LearningTheme
import com.example.learning.View.InformBar
import com.example.learning.View.TechnologiesList
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningTheme {
                Surface {
                    Scaffold { innerPadding ->
                        Column (
                            Modifier
                                .padding(innerPadding)
                                .fillMaxSize()
                        ) {
                            Row(modifier = Modifier.padding(5.dp)) {
                                InformBar()
                            }
                            Row {
                                TechnologiesList()
                                Card { }
                            }
                        }
                    }
                }
            }
        }
    }
}