package com.learn.todoappcircuit

import com.learn.todoappcircuit.api.ErrorResponse
import com.learn.todoappcircuit.api.SuccessResponse
import com.learn.todoappcircuit.api.Todo
import com.learn.todoappcircuit.api.TodoList
import com.learn.todoappcircuit.api.api
import com.slack.eithernet.ApiResult
import com.slack.eithernet.successOrElse
import com.slack.eithernet.successOrNull

class TodoRepository {

    suspend fun getTodos(): List<Todo> {
        return api.getTodos().successOrElse { emptyList() }
    }

}
