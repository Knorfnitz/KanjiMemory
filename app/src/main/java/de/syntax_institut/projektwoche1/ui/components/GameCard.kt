package de.syntax_institut.projektwoche1.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import de.syntax_institut.projektwoche1.R
import de.syntax_institut.projektwoche1.model.Example
import de.syntax_institut.projektwoche1.model.KanjiCard

@Composable
fun GameCard(
    card: KanjiCard,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(80.dp)
            .padding(4.dp)
            .clickable { if (!card.isFlipped && !card.isMatched) onClick() }
            .clip(RoundedCornerShape(8.dp))
            .background(
                when {
                    card.isMatched -> Color.LightGray
                    card.isFlipped -> Color.White
                    else -> Color.Transparent
                }
            ),
        contentAlignment = Alignment.Center
    ) {
        if (!card.isFlipped && !card.isMatched) {
            Image(
                painter = painterResource(id = R.drawable.tsunami_by_hokusai_19th_century),
                contentDescription = "Karten Hintergrund - Große Welle Japan",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
        if (card.isFlipped || card.isMatched) {
            Text(text = card.kanji,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = if (card.isMatched) Color.Gray else Color.Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GameCardPreview() {
    // Use Theme here
    GameCard(
        card = KanjiCard(
            id = 1,
            kanji = "日",
            meaning = listOf("Tag", "Sonne"),
            examples = listOf(
                Example("今日は天気がいいですね。", "Heute ist das Wetter schön."),
                Example("毎日日本語を勉強します。", "Ich lerne jeden Tag Japanisch.")
            )
        ),
        onClick = {}
    )
}