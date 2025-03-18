package de.syntax_institut.projektwoche1.ui.Screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells.Fixed
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import de.syntax_institut.projektwoche1.ui.components.GameCard
import de.syntax_institut.projektwoche1.ui.viewmodel.GameViewModel

@Composable
fun GameScreen(
    modifier: Modifier = Modifier,
    viewModel: GameViewModel
) {
    val cards by viewModel.cards.collectAsState()
    val isGameOver by viewModel.isGameOver.collectAsState()
    val matches by viewModel.matches.collectAsState()
    val isGameStarted by viewModel.isGameStarted.collectAsState()
    val timer by viewModel.timer.collectAsState()
    val selectedCardCount by viewModel.selectedCardCount.collectAsState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 4.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Memory -  神経衰弱",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 36.sp,
                textAlign = TextAlign.Center
            )

            Text(
                text = "Zeit: ${String.format("%02d:%02d", timer / 60, timer % 60)}",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 40.sp,
                textAlign = TextAlign.Center
            )
        }



        LazyVerticalGrid(columns = Fixed(5)) {
            items(cards.size) { index ->
                GameCard(card = cards[index], { viewModel.onCardSelected(index) })
            }
        }
        Column {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                listOf(5, 10, 15, 20).forEach { count ->
                    val isSelected = count == selectedCardCount
                    Button(
                        onClick = { viewModel.setCardCount(count) },
                        enabled = !isGameStarted && !isSelected,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Red,
                            disabledContentColor = Color.White.copy(alpha = 0.4f)
                        )
                    ) {
                        Text(text = "${count * 2}")
                    }
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                if (!isGameStarted) {
                    Button(onClick = { viewModel.startGame() }) {
                        Text("Spiel starten")
                    }
                } else {
                    Button(onClick = { viewModel.restartGame() }) {
                        Text("Neues Spiel")
                    }
                    Button(onClick = { viewModel.pauseTimer() }) {
                        Text("Pause")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GameScreenPreview() {
    // Use Theme here
    GameScreen(viewModel = viewModel())
}
