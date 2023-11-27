package com.kost4n.gift

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kost4n.gift.ui.theme.GiftTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GiftTheme {
                MainPreview()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun MainPreview() {
        GiftTheme {
            Column (
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Привет, Матушка ☻",
                    modifier = Modifier
                        .padding(top = 50.dp),
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Это моя попытка создать маленький подарочек (по " +
                            "аналогии с ботом), только чтобы всё работало всегда",
                    modifier = Modifier
                        .padding(top = 70.dp, start = 20.dp, end = 20.dp),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Пока не знаю что тут будет, но как-то так \n" +
                            "чтобы продлжить нажми на кнопку снизу",
                    modifier = Modifier
                        .padding(top = 70.dp, start = 20.dp, end = 20.dp),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "↓",
                    modifier = Modifier
                        .padding(top = 0.dp, start = 20.dp, end = 20.dp),
                    fontSize = 32.sp,
                    textAlign = TextAlign.Center
                )
                Button(
                    onClick = { startNextAct() },
                    modifier = Modifier
                        .padding(top = 150.dp)
                ) {
                    Text(text = "Жмякни на меня")
                }
            }
        }
    }

    fun startNextAct() = startActivity(Intent(this, MenuActivity::class.java))
}


