package com.example.queezy.data.viewModel

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import com.example.queezy.R
import com.example.queezy.data.Quiz
import com.example.queezy.dataholder.DataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class QueezyViewModel(val context: Context) : ViewModel() {

    private val _data = MutableStateFlow<List<Quiz>>(DataSource.getAllQuiz())
    val data: StateFlow<List<Quiz>> = _data.asStateFlow()
    private var score = mutableStateOf("0")
    private var lastQuiz = mutableStateOf<Quiz?>(null)

    init {
        startGame()
    }

    fun startGame() {

        // there will be a logic which will settles everything to zero
        // or beause of its started samth happesn actuallly


    }

    fun getRandomQuiz(): Quiz {
        var chosenQuiz = data.value.random()
        if (lastQuiz.value == null) {
            lastQuiz.value = chosenQuiz
            return chosenQuiz
        } else {
            while (lastQuiz.value == chosenQuiz) {
                chosenQuiz = data.value.random()
            }
            lastQuiz.value = chosenQuiz
            return chosenQuiz
        }

    }

    fun getOptions(): List<String> {
        val list = emptyList<String>()
        val resId: Int = data.value.random().name
        val randomName = context.getString(R.string.resId)
        if (list.contains(randomName))
    }


}