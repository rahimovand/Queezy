package com.example.queezy.data.viewModel

import android.content.Context
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.queezy.R
import com.example.queezy.data.model.Quiz
import com.example.queezy.dataholder.DataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

const val SCORE_INCREASE = 20
const val SCORE_DECREASE = 4

class QueezyViewModel : ViewModel() {

    private val data = MutableStateFlow<List<Quiz>>(DataSource.getAllQuiz())
    var score = mutableStateOf("0")
    var currentQuiz = mutableStateOf<Quiz?>(null)
    var optionList = mutableStateOf<List<String>>(emptyList())
    private var lastQuiz = mutableStateOf<Quiz?>(null)

    init {
        startGame()
    }

    fun startGame() {
        currentQuiz.value = getRandomQuiz()
        optionList.value = getOptions()
    }



    private fun getRandomQuiz(): Quiz {
        var chosenQuiz = data.value.random()
        while (lastQuiz.value == chosenQuiz) {
            chosenQuiz = data.value.random()
        }
        lastQuiz.value = chosenQuiz
        return chosenQuiz
    }

    private fun getOptions(): List<String> {  // before this function getRandomQuiz must be initialized
        val list = mutableListOf<String>()
        list.add(currentQuiz.value?.name ?: "")
        while (list.size != 4) {
            var randomName = data.value.random().name
            while (list.contains(randomName)) {
                randomName = data.value.random().name
            }
            list.add(randomName)
        }
        return list.shuffled()
    }

    fun checkAnswerOption(chosenOption: String) {
        if (chosenOption == currentQuiz.value?.name) {
            var value = score.value.toInt()
            value += SCORE_INCREASE
            score.value = value.toString()
        } else {
            var value = score.value.toInt()
            value -= SCORE_DECREASE
            score.value = value.toString()
        }
        startGame()
    }


}