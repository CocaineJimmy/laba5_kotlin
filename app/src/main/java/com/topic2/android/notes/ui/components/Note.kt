package com.topic2.android.notes.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.topic2.android.notes.theme.rwGreen
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp

@Composable
fun NoteColor(
    color: Color,
    size: Dp,
    padding: Dp = 0.dp,
    border: Dp
){
    Box(
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
            .background(Color.Red)
            .border(
                BorderStroke(
                    2.dp,
                    SolidColor(Color.Black)

                ),
                CircleShape
            )
            .padding(4.dp)
    )
}

@Preview
@Composable
fun NoteColorPreview(){
    NoteColor(color = Color.Red, size = 40.dp, padding = 4.dp, border = 2.dp)
}

@Composable
fun Note(){

    Row(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxSize()) {
            NoteColor(
                color = rwGreen,
                size = 40.dp,
                padding = 4.dp,
                border = 1.dp
            )
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Заголовок", maxLines = 1)
                Text(text = "Содержание", maxLines = 1)
            }
            Checkbox(
                checked = false, onCheckedChange = {},
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }
}

@Preview
@Composable
private fun NotePreview(){
    Note()
}