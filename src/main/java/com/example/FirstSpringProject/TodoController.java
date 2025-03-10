package com.example.FirstSpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    private static List<Todo> todos;
    public TodoController(){
        todos = new ArrayList<>();
        todos.add(new Todo(1,false,"first todo",1));
    }
    @GetMapping("/todos")
    public List<Todo> getTodos(){
        return todos;
    }
    @PostMapping("/todos")
    public Todo addTodo(@RequestBody Todo newTodo){
        todos.add(newTodo);
        return newTodo;
    }
}
