package com.example.androidplaygroundcomponse.birthdayCardUI

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidplaygroundcomponse.birthdayCardUI.ui.theme.BirthdayCardTheme

class BirthayCardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting2(text = "Happy Birthday Aditya",from = "Don")
                }
            }
        }
    }
}
//@Composable function name must be in Pascal case(All words capitalized)
//Describes some part of your UI.
//Doesn't return anything.
@Composable
fun Greeting2(text: String, from : String,modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(text = "$text", fontSize = 100.sp, lineHeight = 116.sp, textAlign = TextAlign.Center)
        Text(text = "from $from",fontSize = 36.sp, modifier = Modifier.padding(16.dp).align(alignment = Alignment.End))
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun BirthdayCardPreview() {
    BirthdayCardTheme() {
        Greeting2(text = "Happy Birthday Aditya",from = "Don")
    }
}