package de.syntax_institut.projektwoche1.ui.Screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import de.syntax_institut.projektwoche1.ui.viewmodel.GameViewModel
import kotlinx.serialization.Serializable

@Serializable
object GameRoute

@Serializable
object ProfilRoute

enum class TabItem(val route: Any, val icon: ImageVector, val title: String) {
    GAME(GameRoute, Icons.Default.Star, "Spiel"),
    PROFIL(ProfilRoute, Icons.Default.Person, "Profil"),
}

@Composable
fun AppStart(viewModel: GameViewModel = viewModel()) {
    val navController = rememberNavController()
    var selectedTab by rememberSaveable { mutableStateOf(TabItem.GAME) }
    val isGameStarted by viewModel.isGameStarted.collectAsState()

    Scaffold(
        bottomBar = {
            if (!isGameStarted) {
                NavigationBar {
                    TabItem.entries.forEach {
                        NavigationBarItem(
                            selected = selectedTab == it,
                            onClick = {
                                selectedTab = it
                            },
                            icon = {
                                Icon(it.icon, null)
                            },
                            label = {
                                Text(it.title)
                            }
                        )
                    }
                }
            }
        }

    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = selectedTab.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable<GameRoute> {
                GameScreen(viewModel = viewModel)
            }
            composable<ProfilRoute> {
                ProfilScreen()
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
private fun AppStartPreview() {
    // Use Theme here
    AppStart()
}