package com.example.queezy.ui.App.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun InformationCard(
    modifier: Modifier = Modifier,
    text:String
) {
    Text(
        text = text,
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .border(width = 2.dp, color = MaterialTheme.colorScheme.inversePrimary, shape = RoundedCornerShape(16.dp))
            .padding(10.dp)
        ,
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.titleMedium,
        fontFamily = FontFamily.Monospace,
        maxLines = 5,
        overflow = TextOverflow.Ellipsis,
    )
}