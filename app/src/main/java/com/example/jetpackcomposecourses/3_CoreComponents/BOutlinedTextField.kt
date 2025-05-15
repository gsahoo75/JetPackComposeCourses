package com.example.jetpackcomposecourses.`3_CoreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SimpleOutlinedTextFieldSample(){
    var text by remember { mutableStateOf("") }

    val rainbowColors = listOf(
        Color.Red,
        Color.Yellow,
        Color.Green,
        Color.Blue,
    )
    var text1 by remember {
        mutableStateOf("")
    }

    val brush = remember{
        Brush.linearGradient(rainbowColors)
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        TextField(value = text, onValueChange = {
            text = it
        }, textStyle = TextStyle(brush = brush))
//        OutlinedTextField(
//            value = text,
//            onValueChange = {
//                text = it
//            },
//            label = {
//                Text("Label")
//            }
//        )
//        we can have password text field as well
    }
}

@Preview(showSystemUi = true)
@Composable
fun SimpleOutlinedTextFieldSamplePreview(){
    SimpleOutlinedTextFieldSample()
}