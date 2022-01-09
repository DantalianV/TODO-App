package com.dantalian.todoapp.data

import kotlinx.coroutines.flow.Flow

interface TodoRepository {
    suspend fun addTodo(todo: Todo)

    suspend fun deleteTodo(todo: Todo)

    suspend fun getTodoById(id: Int?): Todo?

    fun getTodos(): Flow<List<Todo>>
}