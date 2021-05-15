package com.rukevwe.todo.resource

import com.rukevwe.todo.data.Todo
import com.rukevwe.todo.service.TodoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class MessageResource {

    @Autowired
    private lateinit var service: TodoService

    @GetMapping
    fun index(): List<Todo> = service.findItems()

    @PostMapping
    fun post(@RequestBody todo: Todo): Boolean {
        return service.post(todo) != null
    }
}