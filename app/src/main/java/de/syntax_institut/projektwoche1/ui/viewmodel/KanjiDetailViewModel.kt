package de.syntax_institut.projektwoche1.ui.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.toRoute
import de.syntax_institut.projektwoche1.data.DataSource
import de.syntax_institut.projektwoche1.model.KanjiCard
import de.syntax_institut.projektwoche1.ui.screen.KanjiDetailsRoute

class KanjiDetailViewModel(
    savedStateHandle: SavedStateHandle
): ViewModel() {
    private val args = savedStateHandle.toRoute<KanjiDetailsRoute>()

    val kanji = DataSource.kanjiList.find { it.id == args.id }


        /*KanjiCard(
        args.id,
        args.kanji,
        args.meaning,
        args.examples,
        args.isFlipped,
        args.isMatched
    )*/
}