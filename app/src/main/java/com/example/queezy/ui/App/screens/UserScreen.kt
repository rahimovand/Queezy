package com.example.queezy.ui.App.screens

import android.app.Activity
import androidx.activity.compose.LocalActivity
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.queezy.R
import com.example.queezy.data.model.Quiz
import com.example.queezy.data.viewModel.QueezyViewModel
import com.example.queezy.ui.App.components.FlagRep
import com.example.queezy.ui.App.components.InformationCard
import com.example.queezy.ui.App.components.OptionRep
import com.example.queezy.ui.App.components.PointRep
import com.example.queezy.ui.App.components.QuitDialog
import com.example.queezy.ui.App.components.UserScreenButtons
import com.example.queezy.ui.App.theme.evenShape
import com.example.queezy.ui.App.theme.oddShape
import com.example.queezy.utils.popBackStackOnce

@Composable
fun UserScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    activity: Activity? = LocalActivity.current,
    viewModel: QueezyViewModel = viewModel()
) {


    var chosenItem by rememberSaveable { mutableStateOf("") }
    var doUserWantsToFinish by rememberSaveable { mutableStateOf(false) }
    val optionList = viewModel.optionList.value
    val currentQuiz =
        viewModel.currentQuiz.value ?: Quiz(name = "idk", R.drawable._929176121626934417, "")

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {


        PointRep(
            score = viewModel.score.value,
            backButtonClicked = { navController.popBackStackOnce() }
        )  // this are needs apoint whiuch will be by default 0 so it will grew with an animation when the user finds out true

        InformationCard(text = currentQuiz.hint)

        FlagRep(modifier = modifier, flag = currentQuiz.flag)

        Column(modifier = modifier.padding(3.dp)) {
            optionList.forEachIndexed { index, eachItem ->
                OptionRep(
                    modifier = modifier,
                    text = eachItem,
                    shape = if (index % 2 == 0) evenShape else oddShape,
                    selected = chosenItem == eachItem,
                    onClick = { chosenItem = eachItem }
                )
            }
        }  // this area needs  a 4 option in a text format aand one of them wilol be chosen

        UserScreenButtons(
            modifier = modifier,
            isHintClicked = {},
            isNextClicked = {
                if (chosenItem.isNotEmpty()) {
                    viewModel.checkAnswerOption(chosenItem)
                    chosenItem = ""
                }
            },
            isFinishClicked = {
                doUserWantsToFinish = true
            } // alertdialog shows the result of al;l value user have achieved and congrating and then just leave or stay
        )
        if (doUserWantsToFinish) {
            QuitDialog(
                score = viewModel.score.value,
                confirmButton = { activity?.finish() },
                dissMissButton = {
                    doUserWantsToFinish = false
                }
            )
        }
    }
}

@Preview(device = Devices.PIXEL_2)
@Composable
fun Check() {
    UserScreen(navController = rememberNavController())
}