package com.learn.todoappcircuit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/learn/todoappcircuit/TodoPresenter;", "Lcom/slack/circuit/runtime/presenter/Presenter;", "Lcom/learn/todoappcircuit/TodoScreen$State;", "navigator", "Lcom/slack/circuit/runtime/Navigator;", "repository", "Lcom/learn/todoappcircuit/TodoRepository;", "(Lcom/slack/circuit/runtime/Navigator;Lcom/learn/todoappcircuit/TodoRepository;)V", "present", "Factory", "app_debug"})
public final class TodoPresenter implements com.slack.circuit.runtime.presenter.Presenter<com.learn.todoappcircuit.TodoScreen.State> {
    @org.jetbrains.annotations.NotNull()
    private final com.slack.circuit.runtime.Navigator navigator = null;
    @org.jetbrains.annotations.NotNull()
    private final com.learn.todoappcircuit.TodoRepository repository = null;
    
    public TodoPresenter(@org.jetbrains.annotations.NotNull()
    com.slack.circuit.runtime.Navigator navigator, @org.jetbrains.annotations.NotNull()
    com.learn.todoappcircuit.TodoRepository repository) {
        super();
    }
    
    @java.lang.Override()
    @androidx.compose.runtime.Composable()
    @org.jetbrains.annotations.NotNull()
    public com.learn.todoappcircuit.TodoScreen.State present() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/learn/todoappcircuit/TodoPresenter$Factory;", "Lcom/slack/circuit/runtime/presenter/Presenter$Factory;", "repository", "Lcom/learn/todoappcircuit/TodoRepository;", "(Lcom/learn/todoappcircuit/TodoRepository;)V", "create", "Lcom/slack/circuit/runtime/presenter/Presenter;", "screen", "Lcom/slack/circuit/runtime/screen/Screen;", "navigator", "Lcom/slack/circuit/runtime/Navigator;", "context", "Lcom/slack/circuit/runtime/CircuitContext;", "app_debug"})
    public static final class Factory implements com.slack.circuit.runtime.presenter.Presenter.Factory {
        @org.jetbrains.annotations.NotNull()
        private final com.learn.todoappcircuit.TodoRepository repository = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        com.learn.todoappcircuit.TodoRepository repository) {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public com.slack.circuit.runtime.presenter.Presenter<?> create(@org.jetbrains.annotations.NotNull()
        com.slack.circuit.runtime.screen.Screen screen, @org.jetbrains.annotations.NotNull()
        com.slack.circuit.runtime.Navigator navigator, @org.jetbrains.annotations.NotNull()
        com.slack.circuit.runtime.CircuitContext context) {
            return null;
        }
    }
}