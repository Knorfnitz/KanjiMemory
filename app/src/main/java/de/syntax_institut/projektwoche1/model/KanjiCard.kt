package de.syntax_institut.projektwoche1.model

import kotlinx.serialization.Serializable

data class KanjiCard(
    val id: Int,
    val kanji: String,
    val meaning: List<String>,
    val examples: List<Example>,
    val isFlipped: Boolean = false,
    val isMatched: Boolean = false
)
@Serializable
data class Example(
    val jp: String,
    val de: String
)