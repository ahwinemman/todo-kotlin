package com.rukevwe.todo.service

import com.rukevwe.todo.data.Todo
import com.rukevwe.todo.data.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoService(val db: TodoRepository) {

    fun findItems(): List<Todo> = db.findAll()

    fun post(todo: Todo): Todo {
        return db.save(todo)
    }
}