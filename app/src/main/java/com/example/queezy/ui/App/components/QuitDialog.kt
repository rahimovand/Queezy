package com.example.queezy.ui.App.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun QuitDialog(
    modifier: Modifier = Modifier,
    dissMissButton: () -> Unit,
    confirmButton: () -> Unit
) {
    AlertDialog(
        text = {
            Column {
                Text("All the remaining of scores that you've made will be lost if you quit the game now")
            }
        },
        title = {
            Column {
                Text("Quit the game")
            }
        },
        onDismissRequest = {},
        confirmButton = {
            Button (
                onClick = confirmButton
            ) {
                Text("Quit")
            }
        },
        dismissButton = {
            OutlinedButton(
                onClick = dissMissButton
            ) {
                Text("Cancel")
            }
        }
    )
}