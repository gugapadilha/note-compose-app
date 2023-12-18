package com.plcoding.noteappkmm.domain.data.note

import com.plcoding.noteappkmm.domain.note.Note

class SearchNotes {
    fun execute(note: List<Note>, query: String): List<Note> {
        if (query.isBlank()){
            return note
        }
    }
}