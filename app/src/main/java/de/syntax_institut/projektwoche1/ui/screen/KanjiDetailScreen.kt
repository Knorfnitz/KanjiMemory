package de.syntax_institut.projektwoche1.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import de.syntax_institut.projektwoche1.ui.viewmodel.KanjiDetailViewModel
import de.syntax_institut.projektwoche1.ui.viewmodel.KanjiListViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun KanjiDetailScreen(
    modifier: Modifier = Modifier,
    viewModel: KanjiDetailViewModel = viewModel()
) {
    val kanji = viewModel.kanji

    if (kanji != null) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(text = kanji.kanji, fontSize = 40.sp, fontWeight = FontWeight.Bold)
            Text(text = "Bedeutungen: ${kanji.meaning.joinToString(", ")}", fontSize = 20.sp)

            Spacer(Modifier.height(24.dp))

            LazyColumn {
                items(kanji.examples) { example ->
                    Text(text = example.jp, fontSize = 20.sp)
                    Text(text = example.de, fontSize = 20.sp)
                    Spacer(Modifier.height(16.dp))
                }
            }
        }
    } else {
        Text(text = "Kanji nicht gefunden", fontSize = 24.sp, color = Color.Red)
    }
}

@Preview(showBackground = true)
@Composable
private fun KanjiDetailScreenPreview() {
    // Use Theme here
    KanjiDetailScreen()
}