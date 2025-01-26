package com.example;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    List<Todo> Todos = new ArrayList<>();

    public TodoService(){
    }
    public List<Todo> getAllTasks(){
        return Todos;
    }
    public Todo getTaskByNumber(int number){
        return Todos.get(number-1);
    }
    public void addTask(String content, Boolean completed){
        Todo newTask = new Todo(content,completed);
        Todos.add(newTask);
    }
    public void deleteTask(int number){
        Todos.remove(number-1);
    }

    public void completeTask(int number){
        Todos.get(number-1).setCompleted(!Todos.get(number-1).getCompleted());
    }

}
