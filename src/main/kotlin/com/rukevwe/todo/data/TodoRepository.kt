package com.rukevwe.todo.data

import org.springframework.data.repository.CrudRepository

interface TodoRepository : CrudRepository<Todo, String> {
    override
    fun findAll(): List<Todo>
}
