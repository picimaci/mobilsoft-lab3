package com.example.picimaci.mobilsoft_lab3.ui.todo;

import com.example.picimaci.mobilsoft_lab3.model.Todo;

public interface TodoScreen {
    void showTodo(Todo todo);
    void showNetworkError(String errorMsg);
}
