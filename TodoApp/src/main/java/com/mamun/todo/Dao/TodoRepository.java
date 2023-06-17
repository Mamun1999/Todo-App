package com.mamun.todo.Dao;

import com.mamun.todo.Entity.TodoApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoApp,Integer> {

}
