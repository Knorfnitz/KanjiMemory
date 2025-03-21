package de.syntax_institut.projektwoche1.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
    var flipped by remember { mutableStateOf(card.isFlipped || card.isMatched) }

    val rotation = animateFloatAsState(
        targetValue = if (flipped) 180f else 0f,
        animationSpec = tween(durationMillis = 400),
        label = "cardFlip"
    )

    LaunchedEffect(card.isFlipped || card.isMatched) {
        flipped = card.isFlipped || card.isMatched
    }

    Box(
        modifier = modifier
            .size(80.dp)
            .padding(4.dp)
            .clickable {
                if (!card.isFlipped && !card.isMatched) onClick()
            }
            .graphicsLayer {
                rotationY = rotation.value
                cameraDistance = 8 * density
            }
            .clip(RoundedCornerShape(8.dp)),
        contentAlignment = Alignment.Center
    ) {
        if (rotation.value <= 90f) {
            Image(
                painter = painterResource(id = R.drawable.tsunami_by_hokusai_19th_century),
                contentDescription = "Karten Hintergrund - Große Welle Japan",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        } else {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        color = if (card.isMatched) Color.LightGray else Color.White
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = card.kanji,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (card.isMatched) Color.Gray else Color.Black,
                )
            }
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