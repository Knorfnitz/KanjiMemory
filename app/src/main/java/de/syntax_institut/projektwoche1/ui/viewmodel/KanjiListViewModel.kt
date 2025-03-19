package de.syntax_institut.projektwoche1.ui.viewmodel

import androidx.lifecycle.ViewModel
import de.syntax_institut.projektwoche1.data.DataSource
import de.syntax_institut.projektwoche1.model.KanjiCard
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class KanjiListViewModel : ViewModel() {

    private val _kanjiList = MutableStateFlow(DataSource.kanjiList)
    val kanjiList = _kanjiList.asStateFlow()

    private val _userInputs = MutableStateFlow(mutableMapOf<Int, String>())
    val userInputs = _userInputs.asStateFlow()

    private val _feedback = MutableStateFlow(mutableMapOf<Int, Boolean?>())
    val feedback = _feedback.asStateFlow()

    fun updateUserInput(kanjiId: Int, input: String) {
        _userInputs.value = _userInputs.value.toMutableMap().apply {
            this[kanjiId] = input
        }
    }

    fun checkAnswer(kanji: KanjiCard) {
        val userInput = _userInputs.value[kanji.id]?.trim()?.lowercase() ?: ""
        val isCorrect = kanji.meaning.any { it.lowercase() == userInput }

        _feedback.value = _feedback.value.toMutableMap().apply {
            this[kanji.id] = isCorrect
        }
    }
}