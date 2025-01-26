package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;


    @GetMapping("/tasks")
    private List<Todo> getAllTasks(){
        return todoService.getAllTasks();
    }

    @GetMapping("/task/{number}")
    private Todo getTaskByNumber(@PathVariable int number){
        return todoService.getTaskByNumber(number);
    }

    @PostMapping("/addtask")
    private void addTask(@RequestParam String content, @RequestParam Boolean completed){
        todoService.addTask(content,completed);
    }

    @DeleteMapping("/task/{number}")
    private void deleteTask(@PathVariable int number){
        todoService.deleteTask(number);
    }

    @PutMapping("/tasks/{number}/complete")
    public void completeTask(@PathVariable int number){
        todoService.completeTask(number);
    }

}
