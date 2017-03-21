package com.example.picimaci.mobilsoft_lab3.ui.todolistlist;

import com.example.picimaci.mobilsoft_lab3.model.TodoList;

import java.util.List;

/**
 * Created by PICIMACI on 2017.03.20..
 */

public interface TodoListListScreen {
    void showTodoListList(List<TodoList> todoListList);

    void showNetworkError(String errorMsg);
}
