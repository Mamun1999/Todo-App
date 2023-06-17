package com.mamun.todo.Service;

import com.mamun.todo.Dao.TodoRepository;
import com.mamun.todo.Entity.TodoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TodoServiceImple implements TodoService{

    @Autowired
    private TodoRepository todoRepository;
    @Override
    public TodoApp create(TodoApp todoApp) {
      TodoApp saved=  this.todoRepository.save(todoApp);
      return saved;
    }

    @Override
    public TodoApp update(TodoApp todoApp, int id) {
       TodoApp previous=  this.todoRepository.findById(id).get();
       previous.setTitle(todoApp.getTitle());
       previous.setContent(todoApp.getContent());
       previous.setComplete(todoApp.isComplete());
        return this.todoRepository.save(previous);
    }

    @Override
    public void delete(int id) {
     TodoApp todoApp= this.todoRepository.findById(id).get();
      this.todoRepository.delete(todoApp);
    }

    @Override
    public List<TodoApp> getAll() {

        return this.todoRepository.findAll();
    }



    @Override
    public TodoApp getById(int id) {
        return this.todoRepository.findById(id).get();
    }
}
