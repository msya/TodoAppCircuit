package com.learn.todoappcircuit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import com.learn.todoappcircuit.api.Todo
import com.learn.todoappcircuit.api.TodoList
import com.slack.circuit.runtime.CircuitContext
import com.slack.circuit.runtime.Navigator
import com.slack.circuit.runtime.presenter.Presenter
import com.slack.circuit.runtime.screen.Screen

class TodoPresenter(private val navigator: Navigator, private val repository: TodoRepository) : Presenter<TodoScreen.State> {

    @Composable
    override fun present(): TodoScreen.State {
        val todoList by produceState<List<Todo>>(initialValue = emptyList()) {
            value = repository.getTodos()
        }

        return TodoScreen.State(
            tasks = todoList.map { it.title }, { event ->
                when (event) {
                    is TodoScreen.Event.TaskClicked -> navigator.goTo(TodoDetailsScreen(event.taskId))
                }
            }
        )
    }

    class Factory(private val repository: TodoRepository) : Presenter.Factory {
        override fun create(screen: Screen, navigator: Navigator, context: CircuitContext): Presenter<*>? {
            return when (screen) {
                TodoScreen -> return TodoPresenter(navigator, repository)
                else -> null
            }
        }
    }
}
