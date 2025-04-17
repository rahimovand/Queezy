package com.example.queezy.ui.App.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.queezy.utils.popBackStackOnce

@Composable
fun UserScreenButtons(
    modifier: Modifier,
    isHintClicked: () -> Unit,
    isFinishClicked: () -> Unit,
    isNextClicked: () -> Unit
) {
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
                onClick = isHintClicked,
                enabled = false
            ) {
                Text(
                    text = "Hint",
                    style = MaterialTheme.typography.titleMedium
                )
            }
            ElevatedButton(
                modifier = modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(5.dp),
                onClick = isNextClicked,
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
            onClick = isFinishClicked,
        ) {
            Text("Finish")
        }
    }
}