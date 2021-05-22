package com.example.androidproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidproject.ui.theme.AndroidProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTheme {

            }

        }
    }
}

@Composable
fun UnitConverter() {
    val text = remember { mutableStateOf(TextFieldValue("Text")) }
    Column() {
        Row(){
            OutlinedTextField(value = text.value,
                onValueChange = { text.value = it },
                label = { Text("Enter Unit") })

        }
        Spacer(
            Modifier.padding(10.dp)
        )
        Row(){
            val text = remember { mutableStateOf(TextFieldValue("Text")) }
            OutlinedTextField(value = text.value,
                onValueChange = { text.value = it },
                label = { Text("Enter Unit") })

        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidProjectTheme {
        UnitConverter()
    }
}