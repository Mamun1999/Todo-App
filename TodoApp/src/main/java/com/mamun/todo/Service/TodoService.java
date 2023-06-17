package com.mamun.todo.Service;

import com.mamun.todo.Entity.TodoApp;

import java.util.List;

public interface TodoService {

    TodoApp create(TodoApp todoApp);

    TodoApp update(TodoApp todoApp, int id);

    void delete(int id);

    List<TodoApp> getAll();
    TodoApp getById(int id);
}
