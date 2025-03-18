package de.syntax_institut.projektwoche1.model

data class KanjiCard(
    val id: Int,
    val kanji: String,
    val meaning: List<String>,
    val examples: List<Example>,
    val isFlipped: Boolean = false,
    val isMatched: Boolean = false
)

data class Example(
    val jp: String,
    val de: String
)