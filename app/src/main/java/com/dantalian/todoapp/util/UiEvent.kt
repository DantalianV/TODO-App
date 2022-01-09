package com.dantalian.todoapp.util

sealed class UiEvent {
    object popBackStack: UiEvent()
    data class Navigate(val route: String): UiEvent()
    data class showSnackBar(
        val message: String,
        val action: String? = null
    ): UiEvent()
}
