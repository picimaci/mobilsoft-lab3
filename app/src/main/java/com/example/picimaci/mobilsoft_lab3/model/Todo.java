package com.example.picimaci.mobilsoft_lab3.model;


import java.util.Date;

/**
 * Created by mobsoft on 2017. 03. 20..
 */

public class Todo {

    private String title;

    private String description;

    private Date deadline;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
