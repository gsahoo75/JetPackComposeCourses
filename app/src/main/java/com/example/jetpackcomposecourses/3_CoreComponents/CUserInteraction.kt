package com.example.jetpackcomposecourses.`3_CoreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PartialSelectableText(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        SelectionContainer {
            Column {
                Text("this is the first text which is selectable")
                Text("this is one too")
                Text("this is one too")
            }
            DisableSelection {
                Text("But not this one")
                Text("neither this one")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PartialSelectableTextPreview(){
    PartialSelectableText()
}
