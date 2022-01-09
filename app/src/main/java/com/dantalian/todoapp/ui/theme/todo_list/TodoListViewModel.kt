package com.dantalian.todoapp.ui.theme.todo_list

import androidx.lifecycle.ViewModel
import com.dantalian.todoapp.data.TodoRepository
import com.dantalian.todoapp.util.UiEvent
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

class TodoListViewModel @Inject constructor(
    private val repository: TodoRepository
): ViewModel() {
    val todolist = repository.getTodos()

    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()
}