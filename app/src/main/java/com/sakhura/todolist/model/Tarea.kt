package com.sakhura.todolist.model

data class Tarea(
    val id: Long,
    var texto: String,
    var completada: Boolean = false,
    val fechaCreacion: Long = System.currentTimeMillis()
)
