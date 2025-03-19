package de.syntax_institut.projektwoche1.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import de.syntax_institut.projektwoche1.model.KanjiCard
import androidx.lifecycle.viewmodel.compose.viewModel
import de.syntax_institut.projektwoche1.ui.viewmodel.KanjiListViewModel


@Composable
fun KanjiListScreen(
    onNavigateToKanjiDetails: (KanjiCard) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: KanjiListViewModel = viewModel()
) {
    val kanjiList by viewModel.kanjiList.collectAsState()
    val userInputs by viewModel.userInputs.collectAsState()
    val feedback by viewModel.feedback.collectAsState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Kanji-Liste",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            items(kanjiList.shuffled()) { kanji ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .clickable { onNavigateToKanjiDetails(kanji) }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            kanji.kanji,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.weight(1f)
                        )

                        Column(modifier = Modifier.weight(2f)) {
                            var userInput by remember { mutableStateOf(userInputs[kanji.id] ?: "") }

                            OutlinedTextField(
                                value = userInput,
                                onValueChange = {
                                    userInput = it
                                    viewModel.updateUserInput(kanji.id, it)
                                },
                                label = { Text("Übersetzung eingeben") },
                                singleLine = true
                            )

                            Button(
                                onClick = { viewModel.checkAnswer(kanji) },
                                modifier = Modifier.padding(top = 4.dp)
                            ) {
                                Text("Prüfen")
                            }

                            feedback[kanji.id]?.let { isCorrect ->
                                Text(
                                    text = if (isCorrect) "✔️ Richtig!" else "❌ Falsch",
                                    color = if (isCorrect) Color.Green else Color.Red,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun KanjiListScreenPreview() {
    // Use Theme here
    KanjiListScreen(
        onNavigateToKanjiDetails = {}
    )
}