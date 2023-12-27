package com.plcoding.noteappkmm.android.note_detail

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun NoteDetailScreen(
    noteId: Long,
    viewModel: NoteDetailViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    val hastNoteBeenSaved by viewModel.hasNoteBeenSaved.collectAsState()
    
    LaunchedEffect(key1 = hastNoteBeenSaved){
        if (hastNoteBeenSaved){

        }
    }
}