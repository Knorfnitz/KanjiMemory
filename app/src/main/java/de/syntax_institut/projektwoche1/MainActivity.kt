package de.syntax_institut.projektwoche1

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
import de.syntax_institut.projektwoche1.ui.Screen.AppStart
import de.syntax_institut.projektwoche1.ui.Screen.GameScreen
import de.syntax_institut.projektwoche1.ui.theme.Projektwoche1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Projektwoche1Theme {
                AppStart()
            }
        }
    }
}

