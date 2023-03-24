package com.example.composesample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Text(
        text = "Home Screen",
        fontSize = 32.sp,
        color = Color.White,
        overflow = TextOverflow.Ellipsis,
        maxLines = 1,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(color = Color.Black)
            .fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}