package com.example.jetpackcomposecourses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposecourses.`4_LayoutComposables`.LazyColumExample
import com.example.jetpackcomposecourses.`5_BottomSheet`.PartialBottomSheet
import com.example.jetpackcomposecourses.`6_Cards`.ElevatedCardExample
import com.example.jetpackcomposecourses.`7_CheckBox`.CheckBoxExample
import com.example.jetpackcomposecourses.ui.theme.JetPackComposeCoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeCoursesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CheckBoxExample()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeCoursesTheme {
        Greeting("Android")
    }
}