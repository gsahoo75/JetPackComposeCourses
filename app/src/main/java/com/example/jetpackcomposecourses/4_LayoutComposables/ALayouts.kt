package com.example.jetpackcomposecourses.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

// 1. Column, it allows you to place its children in a vertical sequence.
// 2. Row, it allows you to place its children in a horizontal sequence
// 3. Box, It is an empty container with every element overlapping by default
// 4. ConstraintLayout: "user only when needed", when Ui very complex
@Composable
fun ColumnExample(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("1")
        Text("2")
        Text("3")
        Text("4")
    }
}


@Composable
fun RowExample(){
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("1")
        Text("2")
        Text("3")
        Text("4")
    }
}

@Composable
fun BoxExample(){
    Box(
        modifier  = Modifier
            .size(200.dp)
            .background(Color.Red),
        contentAlignment = Alignment.Center
    ){
        Box(
            modifier = Modifier
                .size(150.dp)
                .background(Color.Black)
        ){
        }
    }
}


@Composable
fun ConstraintLayoutExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(color = Color.LightGray)
        ){
            val (text1, text2, text3) = createRefs()
            Text(
                modifier = Modifier.constrainAs(text1){
                    bottom.linkTo(parent.bottom, margin = 8.dp)
                    start.linkTo(parent.start, margin = 8.dp)
                },
                text = "Bottom left"
            )

            Text(
                modifier = Modifier.constrainAs(text2){
                    top.linkTo(parent.top, margin = 8.dp)
                    bottom.linkTo(parent.bottom, margin = 8.dp)
                    end.linkTo(parent.end, margin = 8.dp)
                    start.linkTo(parent.start, margin = 8.dp)
                },
                text = "Center"
            )

            Text(
                modifier = Modifier.constrainAs(text3){
                    top.linkTo(parent.top, margin = 8.dp)
                    end.linkTo(parent.end, margin = 8.dp)

                },
                text = "Top right"
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ColumnPreview(){
    ConstraintLayoutExample()
}

// Best Practice
/// do not over nest