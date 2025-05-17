package com.example.jetpackcomposecourses.`5_BottomSheet`

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PartialBottomSheet(){
    var showBottomSheet by remember { mutableStateOf(false) }
    var sheetState = rememberModalBottomSheetState()
    Column(
        modifier = Modifier.fillMaxWidth().height(128.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Button(
            onClick = {
                showBottomSheet = true
                Log.d("suman", "PartialBottomSheet: ${sheetState.isVisible}")
            }
        ) {
            Text(text = "Open  BottomSheet")
        }
    }

    if(showBottomSheet){
        ModalBottomSheet(
            modifier = Modifier.fillMaxHeight(),
            onDismissRequest = {
                showBottomSheet = false
            },
            sheetState = sheetState
        ) {
            Text(text = "this is a bottom sheet, swipe up for open and down for close",
                modifier = Modifier.padding(16.dp)
                    .clickable{
                        Log.d("suman", "PartialBottomSheet: ${sheetState.isVisible}")
                    }
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PartialBottomSheetPreview(){
    PartialBottomSheet()
}