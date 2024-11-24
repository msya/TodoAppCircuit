package com.learn.todoappcircuit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.learn.todoappcircuit.ui.theme.TodoAppCircuitTheme
import com.slack.circuit.backstack.rememberSaveableBackStack
import com.slack.circuit.foundation.Circuit
import com.slack.circuit.foundation.CircuitCompositionLocals
import com.slack.circuit.foundation.CircuitContent
import com.slack.circuit.foundation.NavigableCircuitContent
import com.slack.circuit.foundation.rememberCircuitNavigator

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val repository = TodoRepository()

        val circuit: Circuit =
            Circuit.Builder()
                .addPresenterFactory(TodoPresenter.Factory(repository))
                .addUi<TodoScreen, TodoScreen.State> { state, modifier -> TodoList(state, modifier) }
                .addPresenterFactory(TodoDetailsPresenter.Factory())
                .addUi<TodoDetailsScreen, TodoDetailsScreen.State> { state, modifier -> TaskDetails(state, modifier) }
                .build()

        setContent {
            val backStack = rememberSaveableBackStack(root = TodoScreen)
            val navigator = rememberCircuitNavigator(backStack) {

            }
            CircuitCompositionLocals(circuit) {
                NavigableCircuitContent(navigator = navigator, backStack = backStack)
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TodoAppCircuitTheme {
        Greeting("Android")
    }
}