package com.example.notes

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(notes: Note)

    @Delete
    fun delete(notes: Note)

    @Query("Select * from notes_table order by id ASC" )
    fun getAllNotes() : LiveData<List<Note>>

}