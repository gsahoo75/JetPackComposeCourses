package com.example.jetpackcomposecourses.`8_InputChips`

import android.graphics.drawable.Icon
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InputChipsExample(){
    var enable by remember {
        mutableStateOf(false)
    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        if(!enable){
            InputChip(
                selected = enable,
                onClick = {
//                    enable = !enable
                },
                label = {
                    Text("Disabled")
                },
                avatar = {
                    Icon(Icons.Filled.Person, contentDescription = "Localized description",
                        modifier = Modifier.size(InputChipDefaults.AvatarSize))
                },
                trailingIcon = {
                    Icon(Icons.Filled.Close, contentDescription = "Localized description",
                        modifier = Modifier.size(InputChipDefaults.AvatarSize)
                            .clickable{
                                enable = !enable
                            }
                    )
                }
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Preview() {
    InputChipsExample()
}