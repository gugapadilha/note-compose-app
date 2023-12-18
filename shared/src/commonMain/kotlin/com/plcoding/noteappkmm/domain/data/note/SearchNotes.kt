package com.plcoding.noteappkmm.domain.data.note

import com.plcoding.noteappkmm.domain.note.Note
import com.plcoding.noteappkmm.domain.time.DateTimeUtil

class SearchNotes {
    fun execute(note: List<Note>, query: String): List<Note> {
        if (query.isBlank()){
            return note
        }
        return note.filter {
            it.title.trim().lowercase().contains(query.lowercase()) || it.content.trim().lowercase().contains(query.lowercase())
        }.sortedBy { DateTimeUtil.toEpochMillis(it.created) }
    }
}