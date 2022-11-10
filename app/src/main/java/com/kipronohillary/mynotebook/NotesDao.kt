package com.kipronohillary.mynotebook

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface NotesDao {
    // below is the insert method for
    // adding a new entry to our database.
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(note: Note)

    // below is the delete method
    // for deleting our note.
    fun delete(note: Note)
    // below is the method to read all the notes
    // from our database we have specified the query for it.
    // inside the query we are arranging it in ascending
    // order on below line and we are specifying
    // the table name from which
    // we have to get the data.
    @Query("Select * from notesTable order by id ASC")
       fun getAllNotes():LiveData<List<Note>>
    // below method is use to update the note.
    fun update(note: Note)


}