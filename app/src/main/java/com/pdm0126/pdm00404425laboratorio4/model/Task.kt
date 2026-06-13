package com.pdm0126.pdm00404425laboratorio4.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

//Model/Task.kt

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val endDate: Long = Date().time,
    val isCompleted: Boolean = false
)