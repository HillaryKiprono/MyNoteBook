package com.kipronohillary.mynotebook

import androidx.lifecycle.LiveData

class NoteRepository(private  val notesDao: NotesDao) {
    // on below line we are creating a variable for our list
    // and we are getting all the notes from our DAO class.
    val allNotes: LiveData<List<Note>> = notesDao.getAllNotes()

    // on below line we are creating an insert method
    // for adding the note to our database.
    fun insert(note: Note){
        notesDao.insert(note)
    }
    // on below line we are creating a update method for
    // updating our note from database.
    fun update(note: Note){
        notesDao.update(note)
    }
}