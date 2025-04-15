package com.example.queezy.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Quiz(
    @StringRes
    val name: Int,
    @DrawableRes
    val flag: Int
)
