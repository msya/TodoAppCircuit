package com.learn.todoappcircuit.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/learn/todoappcircuit/api/TodoApi;", "", "getTodos", "Lcom/slack/eithernet/ApiResult;", "", "Lcom/learn/todoappcircuit/api/Todo;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TodoApi {
    
    @retrofit2.http.GET(value = "/todo")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTodos(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.slack.eithernet.ApiResult<? extends java.util.List<com.learn.todoappcircuit.api.Todo>, kotlin.Unit>> $completion);
}