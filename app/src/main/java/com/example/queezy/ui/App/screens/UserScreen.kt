package com.example.queezy.ui.App.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.queezy.R
import com.example.queezy.ui.App.components.FlagRep
import com.example.queezy.ui.App.components.OptionRep
import com.example.queezy.ui.App.components.PointRep
import com.example.queezy.ui.App.theme.evenShape
import com.example.queezy.ui.App.theme.oddShape
import com.example.queezy.utils.Screens

@Composable
fun UserScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    val optionList = remember { mutableStateListOf("Chile", "Portugal", "Argentina", "Uzbekistan") }
    var chosenItem by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        PointRep(
            score = "0"
        )
        FlagRep(
            modifier = modifier,
            flag = R.drawable._929176121626934417
        )

        Column(modifier = modifier.padding(10.dp)) {
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

        Column {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                OutlinedButton(
                    modifier = modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(5.dp),
                    onClick = {
                        navController.popBackStack()
                    }
                ) {
                    Text(
                        text = "Back",
                        style = MaterialTheme.typography.titleMedium
                    )
                }
                ElevatedButton(
                    modifier = modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(5.dp),
                    onClick = {},
                    enabled = false
                ) {
                    Text(
                        text = "Next",
                        style = MaterialTheme.typography.titleMedium
                    )
                }
            }
            Button(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                onClick = {  }
            ) {
                Text("Finish")
            }
        }

    }
}

@Preview(device = Devices.PIXEL_2)
@Composable
fun Check() {
    UserScreen(navController = rememberNavController())
}