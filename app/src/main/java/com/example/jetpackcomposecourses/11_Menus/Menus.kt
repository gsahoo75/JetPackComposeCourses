package com.example.jetpackcomposecourses.`11_Menus`

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DropDownMenuExample(){
    var expanded by remember { mutableStateOf(false) }
    val context = LocalContext.current

    Box(
        modifier = Modifier.fillMaxWidth().padding(16.dp)
    ){
        IconButton(onClick = { expanded = !expanded }) {
            Icon(Icons.Default.MoreVert, contentDescription = "menu icon")
        }

        DropdownMenu(
            modifier = Modifier.width(200.dp),
            expanded = expanded,
            onDismissRequest = {
                expanded = false
            }
        ) {
            DropdownMenuItem(
                modifier = Modifier.fillMaxWidth(),
                text = { Text("Profile") },
                trailingIcon = {
                    Icon(Icons.Outlined.Person, contentDescription = "profile")
                },
                onClick = {
                    Toast.makeText(context, "Profile", Toast.LENGTH_SHORT).show()
                }
            )
            HorizontalDivider()
            DropdownMenuItem(
                text = { Text("Setting") },
                trailingIcon = {
                    Icon(Icons.Outlined.Settings, contentDescription = "setting")
                },
                onClick = {
                    Toast.makeText(context, "Setting", Toast.LENGTH_SHORT).show()
                }
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DropDownMenuExamplePreview(){
    DropDownMenuExample()
}