package com.pdm0126.pdm00404425laboratorio4.data



import androidx.room.Database
import androidx.room.RoomDatabase

import com.pdm0126.pdm00404425laboratorio4.model.Task

@Database(entities = [Task::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}