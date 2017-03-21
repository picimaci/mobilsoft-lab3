package com.example.picimaci.mobilsoft_lab3.model;

import java.util.List;

/**
 * Created by PICIMACI on 2017.03.20..
 */

public class TodoList {

    private String title;

    private List<Todo> todoList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Todo> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<Todo> todoList) {
        this.todoList = todoList;
    }
}
