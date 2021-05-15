package com.rukevwe.todo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository

@SpringBootApplication
class TodoApplication

fun main(args: Array<String>) {
    runApplication<TodoApplication>(*args)
}
