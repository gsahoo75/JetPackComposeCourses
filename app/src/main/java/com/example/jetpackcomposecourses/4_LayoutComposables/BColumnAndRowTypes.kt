package com.example.jetpackcomposecourses.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


// Lazy column
@Composable
fun LazyColumExample(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        Text("lazy column preferred for the list")
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(color = Color.LightGray)
        ) {
            items(100){ index ->
                Text(text = "Item $index in LazyColumn",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .background(Color.White))
            }
        }
    }

}

@Composable
fun LazyRowExample(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        Text("Lazy Row ")
        LazyRow(
            modifier = Modifier.fillMaxWidth()
                .height(200.dp)
                .background(color = Color.LightGray),
            verticalAlignment = Alignment.CenterVertically
        ){
            items(100) { index ->
                Text(text = "$index", modifier = Modifier.height(32.dp).background(color =  if (index % 2 == 0) Color.Red else Color.Green).padding(8.dp))
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LazyPreview() {
    LazyRowExample()
}