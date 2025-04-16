package com.example.queezy.ui.App.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonColors
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp

@Composable
fun OptionRep(
    modifier: Modifier = Modifier,
    text: String,
    selected: Boolean = false,
    onClick: () -> Unit,
    shape: Shape = RoundedCornerShape(16.dp)
) {
    Row(
        modifier = modifier.wrapContentWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        AnimatedVisibility(selected) {
            HorizontalDivider(modifier = modifier.fillMaxWidth(0.05f))
        }
        Row(
            modifier = modifier
                .padding(5.dp)
                .height(45.dp)
                .fillMaxWidth()
                .border(
                    width = 2.dp,
                    color = MaterialTheme.colorScheme.tertiary,
                    shape = shape
                )
                .clip(shape)
                .clickable { onClick() },
            verticalAlignment = Alignment.CenterVertically,
        ) {
            RadioButton(
                modifier = modifier.padding(start = 20.dp),
                selected = selected,
                onClick = null,
                colors = RadioButtonColors(
                    selectedColor = MaterialTheme.colorScheme.onSecondaryContainer,
                    disabledSelectedColor = Color.Gray,
                    unselectedColor = Color.Gray,
                    disabledUnselectedColor = Color.Gray
                )
            )
            Spacer(modifier = modifier.width(20.dp))
            Text(
                text = text,
                style = MaterialTheme.typography.titleSmall,
                fontFamily = FontFamily.Monospace
            )
        }
    }
}