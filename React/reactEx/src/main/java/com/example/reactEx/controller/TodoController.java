package com.example.reactEx.controller;

import com.example.reactEx.entities.Todo;
import com.example.reactEx.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping(path = "/addTodo")
    public Todo viewList(@RequestBody Todo todo){
         return todoService.addTodoList(todo);
    }

    @GetMapping(path = "/view")
    public List<Todo> getTodoList(){
        return todoService.findAll();
    }

    @DeleteMapping(path = "/todos/{id}")
    public void deleteTodo(@PathVariable("id") Long id){
        todoService.deleteTodo(id);
    }
    @PatchMapping("/todos/{id}")
    public void completeTodoList(@PathVariable("id") Long id){
        todoService.markComplete(id);
    }
}
