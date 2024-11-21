package com.example.weatherapplication.ui.screens.dayScreen


import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapplication.domain.model.WeatherData
import com.example.weatherapplication.domain.useCases.WeatherUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class DayScreenViewModel @Inject constructor(
    private val weatherUseCases : WeatherUseCases
) : ViewModel() {



    private val _currentWeatherState = MutableLiveData<WeatherData>()
    val currentWeather : LiveData<WeatherData> get() = _currentWeatherState

    init {
        getCurrentWeather()
    }

    private fun getCurrentWeather(){
        viewModelScope.launch(Dispatchers.IO) {
            val currentWeatherResponse = weatherUseCases.getCurrentWeather(12.5f, 10.2f)
            Log.e(">>>>>>>", "$currentWeatherResponse")
            withContext(Dispatchers.Main){
                _currentWeatherState.value = currentWeatherResponse
            }
        }
    }
}