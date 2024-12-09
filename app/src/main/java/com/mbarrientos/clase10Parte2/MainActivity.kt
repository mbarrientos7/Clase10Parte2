package com.mbarrientos.clase10Parte2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.mbarrientos.clase10Parte2.data.GameScreen
import com.mbarrientos.clase10Parte2.ui.theme.Clase102Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Clase102Theme {
                Surface (
                    modifier = Modifier.fillMaxSize()
                ) {
                    GameScreen()
                }
            }
        }
    }
}