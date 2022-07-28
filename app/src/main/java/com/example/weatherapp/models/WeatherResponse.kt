package com.example.weatherapp.models

import com.weatherapp.models.*
import java.io.Serializable

//10f4e0110ed50d5c56cb744c5eac20d6  -API KEY
data class WeatherResponse(
    val coord: Coord,
    val weather: List<Weather>,
    val base: String,
    val main: Main,
    val visibility: Int,
    val wind: Wind,
    val clouds: Clouds,
    val dt: Int,
    val sys: Sys,
    val id: Int,
    val name: String,
    val cod: Int

) : Serializable