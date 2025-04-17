package com.example.queezy.data.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Quiz(
    val name: String,
    @DrawableRes
    val flag: Int,
    val hint:String
)