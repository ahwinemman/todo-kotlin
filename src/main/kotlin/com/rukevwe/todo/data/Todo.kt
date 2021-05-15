package com.rukevwe.todo.data

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("TODO")
data class Todo(@Id val id: String?, val item: String)