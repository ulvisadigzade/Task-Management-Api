package com.example;

public class Todo {
    private String content;
    private Boolean completed;

    public Todo(String content) {
        this.content = content;
        this.completed = false;
    }
    public Todo(String content, Boolean completed){
        this.content=content;
        this.completed=completed;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
