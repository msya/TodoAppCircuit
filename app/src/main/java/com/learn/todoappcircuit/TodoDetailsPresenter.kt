package com.learn.todoappcircuit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import com.learn.todoappcircuit.api.TodoList
import com.slack.circuit.runtime.CircuitContext
import com.slack.circuit.runtime.Navigator
import com.slack.circuit.runtime.presenter.Presenter
import com.slack.circuit.runtime.screen.Screen

class TodoDetailsPresenter(
    private val screen: TodoDetailsScreen,
    private val navigator: Navigator
) : Presenter<TodoDetailsScreen.State> {

    @Composable
    override fun present(): TodoDetailsScreen.State {
        return TodoDetailsScreen.State(screen.emailId) { event ->
            when (event) {
                TodoDetailsScreen.Event.BackClicked -> navigator.pop()
            }
        }
    }

    class Factory : Presenter.Factory {
        override fun create(
            screen: Screen,
            navigator: Navigator,
            context: CircuitContext
        ): Presenter<*>? {
            return when (screen) {
                is TodoDetailsScreen -> return TodoDetailsPresenter(screen, navigator)
                else -> null
            }
        }
    }
}
