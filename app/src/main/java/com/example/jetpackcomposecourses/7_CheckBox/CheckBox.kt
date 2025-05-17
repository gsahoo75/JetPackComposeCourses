package com.example.jetpackcomposecourses.`7_CheckBox`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CheckBoxExample(){
    val childCheckStates = remember{
        mutableStateListOf(false,false,false)
    }
    val parentState = when{
        childCheckStates.all{it} -> ToggleableState.On
        childCheckStates.none{it} -> ToggleableState.Off
        else -> ToggleableState.Indeterminate
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Text("Select all")
            TriStateCheckbox(
                state = parentState,
                onClick = {
                    val newState = parentState != ToggleableState.On
                    childCheckStates.forEachIndexed { index, _ ->
                        childCheckStates[index] = newState
                    }
                }
            )
        }

        childCheckStates.forEachIndexed { index, checked ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Text("option $index")
                Checkbox(
                    checked = checked,
                    onCheckedChange = {
                        childCheckStates[index] = it
                    }
                )
            }
        }

        if(childCheckStates.all { it }){
            Text("All the options are selected")
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun CheckBoxExamplePreview(){
    CheckBoxExample()
}
