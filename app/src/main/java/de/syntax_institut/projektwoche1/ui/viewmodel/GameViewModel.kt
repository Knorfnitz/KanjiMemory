package de.syntax_institut.projektwoche1.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import de.syntax_institut.projektwoche1.data.DataSource
import de.syntax_institut.projektwoche1.model.KanjiCard
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class GameViewModel : ViewModel() {
    private val _selectedCardCount = MutableStateFlow(5)
    val selectedCardCount = _selectedCardCount.asStateFlow()

    private val _cards = MutableStateFlow<List<KanjiCard>>(emptyList())
    val cards = _cards.asStateFlow()

    private val _matches = MutableStateFlow(0)
    val matches = _matches.asStateFlow()

    private var firstSelectedIndex: Int? = null
    private val _isGameOver = MutableStateFlow(false)
    val isGameOver = _isGameOver.asStateFlow()

    private val _isGameStarted = MutableStateFlow(false)
    val isGameStarted = _isGameStarted.asStateFlow()

    private val _timer = MutableStateFlow(0L)
    val timer = _timer.asStateFlow()

    private var isTimerRunning = false

    fun onCardSelected(index: Int) {
        if (!_isGameStarted.value) return

        val currentCards = _cards.value.toMutableList()
        if (currentCards[index].isMatched || firstSelectedIndex == index) return

        currentCards[index] = currentCards[index].copy(isFlipped = true)
        _cards.value = currentCards

        if (firstSelectedIndex == null) {
            firstSelectedIndex = index
        } else {
            val firstIndex = firstSelectedIndex!!
            if (currentCards[firstIndex].kanji == currentCards[index].kanji) {
                currentCards[firstIndex] = currentCards[firstIndex].copy(isMatched = true)
                currentCards[index] = currentCards[index].copy(isMatched = true)
                _matches.value++
            } else {
                viewModelScope.launch {
                    delay(1000)
                    _cards.value = _cards.value.mapIndexed { i, card ->
                        if (i == firstIndex || i == index) card.copy(isFlipped = false) else card
                    }
                }
            }
            firstSelectedIndex = null
        }

        if (currentCards.all { it.isMatched }) {
            stopTimer()
            _isGameOver.value = true
        }
    }

    fun restartGame() {
        _cards.value = generateShuffledCards()
        firstSelectedIndex = null
        _isGameOver.value = false
        _matches.value = 0
        _isGameStarted.value = false
        resetTimer()
    }

    fun startGame() {
        _cards.value = generateShuffledCards()
        _isGameStarted.value = true
        startTimer()
    }

    fun setCardCount(count: Int) {
        _selectedCardCount.value = count
    }

    private fun generateShuffledCards(): List<KanjiCard> {
        val originalCards = DataSource.kanjiList.shuffled().take(_selectedCardCount.value)
        return (originalCards + originalCards).shuffled().mapIndexed { index, card ->
            card.copy(id = index, isFlipped = false, isMatched = false)
        }
    }

    private fun startTimer() {
        isTimerRunning = true
        viewModelScope.launch {
            while (isTimerRunning) {
                delay(1000)
                _timer.value += 1
            }
        }
    }

    private fun stopTimer() {
        isTimerRunning = false
    }

    private fun resetTimer() {
        isTimerRunning = false
        _timer.value = 0
    }

    fun pauseTimer() {
        isTimerRunning = false
    }
}