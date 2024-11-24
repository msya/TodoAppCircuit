package com.learn.todoappcircuit.api

import com.slack.eithernet.ApiResult
import com.slack.eithernet.integration.retrofit.ApiResultCallAdapterFactory
import com.slack.eithernet.integration.retrofit.ApiResultConverterFactory
import retrofit2.Retrofit
import retrofit2.create
import retrofit2.http.GET

interface TodoApi {

    @GET("/todo")
    suspend fun getTodos(): ApiResult<SuccessResponse, Unit>
}

data class SuccessResponse(val todos: TodoList)

data class TodoList(
    val data: List<Todo>
)

data class Todo(
    val id: Int,
    val title: String,
    val description: String,
    val completed: Boolean,
    val dueDate: String
)

data class ErrorResponse(
    val code: Int,
    val message: String
)

val api = Retrofit.Builder()
    .addConverterFactory(ApiResultConverterFactory)
    .addCallAdapterFactory(ApiResultCallAdapterFactory)
    .baseUrl("http://10.0.2.2:3000")
    .build()
    .create<TodoApi>()

