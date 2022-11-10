package com.kipronohillary.mynotebook

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Timestamp

@Entity(tableName = "notesTable")
class Note (
    @ColumnInfo(name = "tittle") val noteTitle:String,
    @ColumnInfo(name = "description") val noteDescription:String,
    @ColumnInfo(name = "timestamp") val timestamp: String
        )
{
    @PrimaryKey(autoGenerate = true) val id:Int=0
}