package com.example.weatherapplication.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.compose.rememberAsyncImagePainter
import com.example.weatherapplication.provider

@Composable
fun WeatherSlider(minTemp: Float, temp: Float, maxTemp: Float, fontFamily: FontFamily) {
    val weatherSliderState by remember { mutableFloatStateOf(temp) }
    val sliderBrush = Brush.verticalGradient(listOf(Color(0x45BBEEFF), Color(0xF6803600)))

    Column {
        Slider(
            value = weatherSliderState,
            valueRange = minTemp..maxTemp,
            onValueChange = {},
            colors = SliderColors(
                thumbColor = Color(0xFF6DC3F2),
                activeTrackColor = Color(0xFF45BBEE),
                activeTickColor = Color.Blue,
                disabledActiveTickColor = Color.Gray,
                inactiveTickColor = Color.Red,
                disabledThumbColor = Color.White,
                inactiveTrackColor = Color(0xFFF68036),
                disabledActiveTrackColor = Color.White,
                disabledInactiveTickColor = Color.Blue,
                disabledInactiveTrackColor = Color.Red
            ),
            modifier = Modifier.padding(start = 10.dp, end = 10.dp)


        )

        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
        ) {
            Text(
                text = "21°C",
                color = Color(0xFF45BBEE),
                fontFamily = fontFamily,
                fontSize = 16.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "25°C",
                color = Color(0xFF6DC3F2),
                fontFamily = fontFamily,
                fontSize = 16.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "21°C",
                color = Color(0xFFF68036),
                fontFamily = fontFamily,
                fontSize = 16.sp,
                fontWeight = FontWeight.ExtraBold
            )

        }
    }


}



@Composable
fun WeatherMainComponent() {
    val brush = Brush.verticalGradient(listOf(Color(0x414F8CFF), Color(0x414F8C00)))
    val iconPainter = rememberAsyncImagePainter("https://openweathermap.org/img/wn/10d@2x.png")

    val fontName = GoogleFont("Poppins")

    val fontFamily = FontFamily(
        Font(googleFont = fontName, fontProvider = provider)
    )


    Card{
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .width(350.dp)
                .height(204.dp)
                .background(brush)

        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = iconPainter,
                    contentDescription = "",
                    modifier = Modifier
                        .width(76.dp)
                        .height(59.dp)
                )
                Text(
                    text = "Rain",
                    fontFamily = fontFamily,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "01:00 PM",
                    fontFamily = fontFamily,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Medium
                )
            }

            WeatherSlider(minTemp = 21f, temp = 25f, maxTemp = 30f, fontFamily)
            HorizontalDivider(
                thickness = 2.dp,
                color = Color(0xFF6DC3F2),
                modifier = Modifier.padding(
                    top = 10.dp,
                    start = 20.dp,
                    end = 20.dp
                )
            )

            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 40.dp, end = 40.dp, top = 20.dp)
            ) {
                Row {
                    AsyncImage(
                        model = "https://cdn-icons-png.flaticon.com/512/11651/11651850.png",
                        contentDescription = "",
                        modifier = Modifier
                            .width(20.dp)
                            .height(25.dp)
                    )
                    Text(
                        text = "10%",
                        fontFamily = fontFamily,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                }

                Row {
                    AsyncImage(
                        model = "https://cdn-icons-png.flaticon.com/512/2676/2676004.png",
                        contentDescription = "",
                        modifier = Modifier
                            .width(20.dp)
                            .height(25.dp)
                    )
                    Text(
                        text = "20PST",
                        fontFamily = fontFamily,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                }

            }

        }
    }
}
