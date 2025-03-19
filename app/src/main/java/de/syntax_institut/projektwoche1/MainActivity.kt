package de.syntax_institut.projektwoche1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import de.syntax_institut.projektwoche1.ui.screen.AppStart
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

