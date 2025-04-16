package com.example.queezy.ui.App.screens

import android.app.Activity
import androidx.activity.compose.LocalActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.queezy.ui.App.components.StartButton
import com.example.queezy.utils.Screens

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    activity: Activity? = LocalActivity.current
) {

    Row(
        modifier = modifier
            .fillMaxSize()
            .padding(2.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        for (i in 1..2){
            VerticalDivider(modifier = modifier
                .padding(start = 10.dp)
                .rotate(10f)
            )
        }

        Column(
            modifier = modifier
                .fillMaxSize()
                .weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            StartButton(
                text = "Start",
                onClick = {
                    navController.navigate(Screens.UserScreen.name)
                }
            )

            HorizontalDivider(modifier = modifier.padding(top = 10.dp, bottom = 10.dp))

            StartButton(
                text = "Exit",
                onClick = {
                    activity?.finish()
                }
            )
        }

        for (i in 1..2){
            VerticalDivider(modifier = modifier
                .padding(end = 10.dp)
                .rotate(10f)
            )
        }

    }

}