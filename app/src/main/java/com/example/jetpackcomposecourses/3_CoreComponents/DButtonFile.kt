package com.example.jetpackcomposecourses.`3_CoreComponents`

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FilledButtonSample() {
    val context = LocalContext.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
            //Filled Button
//        Button(onClick = {
//            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
//        }){
//            Text("click me")
//        }

            // TonalButton
//        FilledTonalButton(onClick = {
//            Toast.makeText(context,"Clicked", Toast.LENGTH_SHORT).show()
//        }) {
//            Text("Tonal Button")
//        }
        
        
                //Outlined Button
//        OutlinedButton(
//            onClick = {
//                Toast.makeText(context, "outline button clicked", Toast.LENGTH_SHORT).show()
//            }
//        ) {
//            Text("Outlined Button")
//        }


                //Elevated Button
//        ElevatedButton(onClick = {Toast.makeText(context,"elevated button clicked",Toast.LENGTH_SHORT).show()}) {
//            Text("Elevated Button")
//        }


                //Text Button
        TextButton(onClick = {}) {
            Text("Text Button")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ButtonPreview(){
    FilledButtonSample()
}