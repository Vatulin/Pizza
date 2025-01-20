package com.example.pizza

import android.graphics.Bitmap

data class Pizza(
    val rate : Double = 0.0,
    val name : String = "Name",
    val consist : String = "Consist",
    val weight : String = "0g",
    val price : Int = 0,
    var image: Bitmap? = null
)
