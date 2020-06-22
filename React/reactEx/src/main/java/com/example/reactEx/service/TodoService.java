package com.example.reactEx.service;

import com.example.reactEx.entities.Todo;
import com.example.reactEx.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Todo addTodoList(Todo todo){
            return todoRepository.save(todo);
    }

    public List<Todo> findAll(){
        List<Todo> todos= (List<Todo>) todoRepository.findAll();
        return todos;
    }

    public void deleteTodo(Long id){
        todoRepository.deleteById(id);
    }

    public void markComplete(Long id){
        Optional<Todo>  todoOptional=todoRepository.findById(id);
        if(todoOptional.isPresent()){
            Todo todo=todoOptional.get();
            if(!todo.isCompleted()){
                todo.setCompleted(true);
            }else {
                todo.setCompleted(false);
            }
            todoRepository.save(todo);
        }
    }

}
