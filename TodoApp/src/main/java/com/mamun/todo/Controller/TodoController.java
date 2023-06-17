package com.mamun.todo.Controller;

import com.mamun.todo.Entity.TodoApp;
import com.mamun.todo.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api")
@RestController()
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/")
    public ResponseEntity<TodoApp> create(@RequestBody TodoApp todoApp){
      TodoApp created=  this.todoService.create(todoApp);
      return ResponseEntity.ok(created);
    }

    @GetMapping("/")
    public ResponseEntity<List<TodoApp>> getAllTodo(){
       List<TodoApp> list= this.todoService.getAll();
       return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoApp> getById(@PathVariable int id){
       TodoApp todoApp= this.todoService.getById(id);
        return  ResponseEntity.ok(todoApp);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.todoService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoApp> updateTodo(@RequestBody TodoApp todoApp, @PathVariable int id){

      TodoApp todoApp1=  this.todoService.update(todoApp,id);
      return ResponseEntity.ok(todoApp1);
    }
}
