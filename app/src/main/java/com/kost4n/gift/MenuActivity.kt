package com.kost4n.gift

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kost4n.gift.ui.theme.GiftTheme

class MenuActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GiftTheme {
                MenuPreview()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun MenuPreview() {
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Это экран с выбором что ты хочешь",
                modifier = Modifier
                    .padding(top = 15.dp, start = 20.dp, end = 20.dp),
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = "Пока что я сюда добавил экран как с ботом и игрульку" +
                        ", чтоб тебе было не скучно",
                modifier = Modifier
                    .padding(top = 15.dp, start = 20.dp, end = 20.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
            Image(
                bitmap = ImageBitmap.imageResource(R.drawable.sticker),
                contentDescription = "Милая картинка",
                modifier = Modifier
                    .size(250.dp, 250.dp)
                    .padding(top = 20.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 60.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = { startGame() },
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp)
                ) {
                    Text(text = "Игрулька")
                }
                Button(
                    onClick = { startLovely() },
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp)
                ) {
                    Text(text = "Приятности")
                }
            }
        }
    }

    private fun startGame() = startActivity(Intent(this, GamActivity::class.java))
    private fun startLovely() = startActivity(Intent(this, LovelyActivity::class.java))

}