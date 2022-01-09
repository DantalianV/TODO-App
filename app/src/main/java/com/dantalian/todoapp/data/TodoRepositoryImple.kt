package com.dantalian.todoapp.data

import kotlinx.coroutines.flow.Flow

class TodoRepositoryImple(private val dao: TodoDao): TodoRepository {
    override suspend fun addTodo(todo: Todo) {
        dao.addTodo(todo)
    }

    override suspend fun deleteTodo(todo: Todo) {
        dao.deleteTodo(todo)
    }

    override suspend fun getTodoById(id: Int?): Todo? {
        return dao.getTodoById(id)
    }

    override fun getTodos(): Flow<List<Todo>> {
        return dao.getTodos()
    }
}