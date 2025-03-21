package de.syntax_institut.projektwoche1.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells.Fixed
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import de.syntax_institut.projektwoche1.R
import de.syntax_institut.projektwoche1.ui.components.GameCard
import de.syntax_institut.projektwoche1.ui.viewmodel.GameViewModel
import java.util.Locale

@Composable
fun GameScreen(
    modifier: Modifier = Modifier,
    viewModel: GameViewModel
) {
    val cards by viewModel.cards.collectAsState()
    val isGameStarted by viewModel.isGameStarted.collectAsState()
    val timer by viewModel.timer.collectAsState()
    val score by viewModel.score.collectAsState()
    val showBonusDialog by viewModel.showBonusDialog.collectAsState()
    val correctAnswer by viewModel.correctAnswer.collectAsState()
    val selectedCardCount by viewModel.selectedCardCount.collectAsState()
    val awaitingTranslationForId by viewModel.awaitingTranslationForId.collectAsState()
    var userInput by remember { mutableStateOf("") }
    var isAnswerWrong by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 4.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            if (!isGameStarted) {
                Image(
                    painter = painterResource(id = R.drawable.memory_red),
                    contentDescription = "Überschrift Memory",
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
                )
            }
            Text(
                text = "Zeit: ${String.format(Locale.GERMANY, "%02d:%02d", timer / 60, timer % 60)}",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 40.sp,
                textAlign = TextAlign.Center
            )

            Text(
                text = "Punkte: $score",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 32.sp,
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
                }
            }
        }
    }

    if (showBonusDialog) {
        AlertDialog(
            onDismissRequest = {
                viewModel.checkBonusTranslation("")
                isAnswerWrong = false
            },
            title = { Text("Übersetze!") },
            text = {
                Column {
                    val kanjiObject = cards.find { it.id == awaitingTranslationForId }
                    val kanjiSymbol = kanjiObject?.kanji ?: "?"

                    Text(
                        text = "Was bedeutet das Kanji: $kanjiSymbol?",
                        fontSize = 20.sp
                    )

                    if (isAnswerWrong) {
                        Text(
                            "Korrekte Antwort: ${correctAnswer.joinToString(", ")}",
                            color = Color.Red
                        )

                        LaunchedEffect(Unit) {
                            kotlinx.coroutines.delay(2000)
                            viewModel.checkBonusTranslation("")
                            isAnswerWrong = false
                        }
                    }

                    OutlinedTextField(
                        value = userInput,
                        onValueChange = { userInput = it },
                        label = { Text("Übersetzung eingeben") },
                        singleLine = true
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        val isCorrect = correctAnswer.any { it.equals(userInput, ignoreCase = true) }
                        if (isCorrect) {
                            viewModel.checkBonusTranslation(userInput)
                        } else {
                            isAnswerWrong = true
                        }
                        userInput = ""
                    }
                ) {
                    Text("Prüfen")
                }
            },
            dismissButton = {
                Button(
                    onClick = {
                        viewModel.checkBonusTranslation("")
                        isAnswerWrong = false
                    }
                ) {
                    Text("Überspringen")
                }
            }
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun GameScreenPreview() {
    // Use Theme here
    GameScreen(viewModel = viewModel())
}
