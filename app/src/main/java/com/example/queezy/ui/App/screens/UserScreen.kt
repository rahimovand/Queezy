package com.example.queezy.ui.App.screens

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.clipScrollableContainer
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.queezy.R
import com.example.queezy.ui.App.components.FlagRep
import com.example.queezy.ui.App.components.InformationCard
import com.example.queezy.ui.App.components.OptionRep
import com.example.queezy.ui.App.components.PointRep
import com.example.queezy.ui.App.components.UserScreenButtons
import com.example.queezy.ui.App.theme.evenShape
import com.example.queezy.ui.App.theme.oddShape
import com.example.queezy.utils.Screens
import com.example.queezy.utils.popBackStackOnce

@Composable
fun UserScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    val optionList = remember { mutableStateListOf("Chile", "Portugal", "Argentina", "Uzbekistan") }
    var chosenItem by rememberSaveable { mutableStateOf("") }
    val doUserWantsToFinish by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        PointRep(
            score = "0",
            backButtonClicked = { navController.popBackStackOnce() }
        )

        InformationCard(text = "This are will descibe stuff about the flag like ahint for the user to push the thing that doesnt wants to come out fromtheir mouth")

        FlagRep(
            modifier = modifier,
            flag = R.drawable._929176121626934417
        )
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
        }

        UserScreenButtons(
            modifier = modifier,
            isBackClicked = {},
            isNextClicked = {},
            isFinishClicked = {} // alertdialog shows the result of al;l value user have achieved and congrating and then just leave or stay
        )

    }
}

@Preview(device = Devices.PIXEL_2)
@Composable
fun Check() {
    UserScreen(navController = rememberNavController())
}