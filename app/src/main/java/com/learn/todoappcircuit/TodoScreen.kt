package com.learn.todoappcircuit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.slack.circuit.runtime.CircuitUiEvent
import com.slack.circuit.runtime.CircuitUiState
import com.slack.circuit.runtime.screen.Screen
import kotlinx.parcelize.Parcelize

@Parcelize
data object TodoScreen : Screen {
    data class State(
        val tasks: List<String>,
        val eventSink: (Event) -> Unit
    ) : CircuitUiState

    sealed class Event : CircuitUiEvent {
        data class TaskClicked(val taskId: String) : Event()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoList(state: TodoScreen.State, modifier: Modifier = Modifier) {
    Scaffold(modifier = modifier, topBar = { TopAppBar(title = { Text("Todo List") }) }) { innerPadding ->
        LazyColumn(modifier = Modifier.padding(innerPadding)) {
            items(state.tasks) { email ->
                TaskItem(
                    email,
                    modifier = Modifier.clickable {
                        state.eventSink(TodoScreen.Event.TaskClicked(email))
                    }
                )
            }
        }
    }
}

@Composable
fun TaskItem(task: String, modifier: Modifier = Modifier) {
    Row(modifier = modifier.padding(16.dp)) {
        Text(task)
    }
}