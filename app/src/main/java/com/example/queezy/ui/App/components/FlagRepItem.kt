package com.example.queezy.ui.App.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.queezy.R

@Composable
fun FlagRep(
    @DrawableRes
    flag: Int,
    modifier: Modifier = Modifier
) {

    Image(
        painter = painterResource(flag),
        contentDescription = null,
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(0.4f),
        contentScale = ContentScale.Crop
    )

}