package com.pdm0126.pdm00404425laboratorio4.data

import com.pdm0126.pdm00404425laboratorio4.InitDatabase
import com.pdm0126.pdm00404425laboratorio4.model.Task
import kotlinx.coroutines.flow.Flow


class TaskRepository {

    private val dao = InitDatabase.database.taskDao()

    fun getAllTasks(): Flow<List<Task>> = dao.getAllTasks()

    suspend fun addTask(title: String, description: String) {
        val task = Task(title = title, description = description)
        dao.insertTask(task)
    }

    suspend fun deleteTask(task: Task) {
        dao.deleteTask(task)
    }

    suspend fun toggleTask(task: Task) {
        dao.updateTask(task.copy(isCompleted = !task.isCompleted))
    }
}