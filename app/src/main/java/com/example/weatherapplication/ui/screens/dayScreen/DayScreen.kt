package com.example.weatherapplication.ui.screens.dayScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.weatherapplication.ui.components.WeatherMainComponent
import javax.inject.Inject


@Composable
fun DayScreen(
     dayScreenViewModel : DayScreenViewModel
) {


    val currentWeatherState = dayScreenViewModel.currentWeather.observeAsState()

    Scaffold(
        topBar = {DayScreenToolBar()}
    ) { innerPadding ->
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
        ) {
            item {
                WeatherMainComponent(currentWeatherState.value)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DayScreenToolBar() {
    TopAppBar(
        title = {
            Text(text = "Name")
        },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "")
            }
        },

        )
}