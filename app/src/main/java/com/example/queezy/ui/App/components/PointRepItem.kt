package com.example.queezy.ui.App.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp

@Composable
fun PointRep(
    modifier: Modifier = Modifier,
    score: String
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Card(
            modifier = modifier
                .fillMaxWidth(0.20f)
                .fillMaxHeight(0.05f)
                .padding(start = 2.dp),
            border = BorderStroke(
                width = 1.dp,
                color = MaterialTheme.colorScheme.onSecondaryContainer
            )
        ) {
            Column(
                modifier = modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = score,
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }
        for (i in 1..15) {
            HorizontalDivider(
                modifier = modifier
                    .padding(start = 10.dp)
                    .weight(1f),
                color = MaterialTheme.colorScheme.outlineVariant
            )
        }
    }
}