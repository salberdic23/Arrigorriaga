package com.example.arrigorriaga

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.arrigorriaga.ui.theme.ArrigorriagaTheme
import com.example.arrigorriaga.screens.HomeScreen
import com.example.arrigorriaga.screens.LoginScreen
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ArrigorriagaTheme {
                HomeScreen()

            }
        }
    }
}
