package com.example.queezy.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Quiz(
    @StringRes
    val name: Int,
    @DrawableRes
    val flag: Int
)

//object Items {
//    fun getAllQuiz(): List<Quiz> {
//        listOf(
//            Quiz()
//        )
//    }
//}
