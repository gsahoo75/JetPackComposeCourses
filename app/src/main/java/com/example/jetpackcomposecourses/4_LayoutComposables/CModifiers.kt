package com.example.jetpackcomposecourses.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//Modifiers are available in all the composable functions like text, button, image, column, row etc..

@Composable
fun ModifierExample(){
    Box(
        modifier = Modifier.size(500.dp).background(color = Color.Gray),
        contentAlignment = Alignment.Center
    ){
        Text(modifier = Modifier.background(color = Color.Yellow),text = "This is a text" )
    }
}

@Preview(showSystemUi = true)
@Composable
fun ModifierPreview(){
    ModifierExample()
}