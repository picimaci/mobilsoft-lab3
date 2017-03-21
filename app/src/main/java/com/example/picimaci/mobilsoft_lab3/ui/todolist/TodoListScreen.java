package com.example.picimaci.mobilsoft_lab3.ui.todolist;

import com.example.picimaci.mobilsoft_lab3.model.TodoList;

/**
 * Created by PICIMACI on 2017.03.20..
 */

public interface TodoListScreen {
    void showTodoList(TodoList todoList);

    void showNetworkError(String errorMsg);
}
