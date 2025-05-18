package com.example.jetpackcomposecourses.`9_AlertDialogBox`

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.jetpackcomposecourses.R


@Composable
fun DialogWithImage(
){
    Dialog(
        onDismissRequest = {

        }
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
        ){
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "this is dialog image",
                contentScale = ContentScale.Fit,
                modifier = Modifier.height(160.dp)
            )
            Text(text  = "this is the dialog",
                modifier = Modifier.padding(16.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ){
                TextButton(
                    onClick = {},
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text("Confirm")
                }
                TextButton(
                    onClick = {},
                    modifier = Modifier.padding(8.dp)
                ){
                    Text("Cancel")
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DialogWithImagePreview(){
    DialogWithImage()
}