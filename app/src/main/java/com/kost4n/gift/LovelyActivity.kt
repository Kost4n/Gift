package com.kost4n.gift

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kost4n.gift.ui.theme.GiftTheme

class LovelyActivity: ComponentActivity() {
    private val arrText = arrayOf(
        "Умничка",
        "У тебя всё получится",
        "Я тебя люблю \uD83D\uDC95",
        "Всё будет хорошо",
        "Ты у меня самая лучшая",
        "Ты со всем справишься",
        "You're the best momy in the world",
        "Ты как одуванчик",
        "Делай как считаешь нужным",
        "Путин желает хорошего дня!",
        "Хорошего нового дня",
        "Желаю тебе успехов во всех делах",
    )

    private val arrImages = arrayOf(
        R.drawable.sticker,
        R.drawable.sticker111,
        R.drawable.sticker112,
        R.drawable.sticker113,
        R.drawable.sticker1_000,
        R.drawable.sticker_000,
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GiftTheme {
                LovelyPreview()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    private fun LovelyPreview() {
        val countText = remember {
            mutableStateOf(0)
        }
        val countImage = remember {
            mutableStateOf(0)
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Тут будут показываться разные приятные слова по нажатии" +
                        " на кнопку",
                modifier = Modifier
                    .padding(top = 30.dp),
                textAlign = TextAlign.Center,
                fontSize = 22.sp
            )
            Image(
                bitmap = ImageBitmap.imageResource(id = arrImages[countImage.value]),
                contentDescription = "милое фото",
                modifier = Modifier
                    .size(250.dp, 250.dp)
                    .padding(top = 10.dp)
            )
            Text(
                text = arrText[countText.value],
                modifier = Modifier
                    .padding(top = 10.dp),
                textAlign = TextAlign.Center,
                fontSize = 22.sp
            )
            Button(
                onClick = {
                    if (countImage.value == (arrImages.size - 1)) {
                        countImage.value = 0
                    } else {
                        countImage.value++
                    }
                    
                    if (countText.value == (arrText.size - 1)) {
                        countText.value = 0
                    } else {
                        countText.value++
                    }
                },
                modifier = Modifier
                    .padding(top = 30.dp)
            ) {
                Text(text = "Следующее собщенее)")
            }


        }
    }

    private fun makeText() = arrText.random()
    private fun makeImage() = arrImages.random()

}
