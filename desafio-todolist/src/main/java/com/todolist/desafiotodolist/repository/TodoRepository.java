package com.todolist.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolist.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
