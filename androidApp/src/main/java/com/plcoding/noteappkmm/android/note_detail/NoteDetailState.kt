package com.plcoding.noteappkmm.android.note_detail

import androidx.compose.ui.graphics.Color


data class NoteDetailState(
    val noteTitle: String = "",
    val isNoteTitleTextFocused: Boolean = false,
    val noteContent: String = "",
    val isNoteContentTextFocused: Boolean  = false,
    val noteColor: Long = 0xFFFFFF
)
