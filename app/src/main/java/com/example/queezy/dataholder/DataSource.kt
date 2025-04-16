package com.example.queezy.dataholder

import androidx.compose.ui.res.stringResource
import com.example.queezy.R
import com.example.queezy.data.Quiz

object DataSource {
    fun getAllQuiz(): List<Quiz> {
        return listOf(
            Quiz(R.string.UAE, R.drawable._868665411626934443),
            Quiz(R.string.United_Kingdom, R.drawable._320950591626934443),
            Quiz(R.string.Brazil, R.drawable._626585481626934373),
            Quiz(R.string.Nigeria, R.drawable._620667311626934410),
            Quiz(R.string.Chile, R.drawable._929176121626934417),
            Quiz(R.string.Korea, R.drawable._594239531626934433),
            Quiz(R.string.Germany, R.drawable._865140001626934370),
            Quiz(R.string.Hungary, R.drawable._696181521626934397),
            Quiz(R.string.India, R.drawable._407673031553750387),
            Quiz(R.string.Spain, R.drawable._330325361626934434),
            Quiz(R.string.Poland, R.drawable._635710591626934419),
            Quiz(R.string.Venezuela, R.drawable._813836031626934447),
            Quiz(R.string.Egypt, R.drawable._086998941626934385)
        )
    }
}