package com.todo.todo.Repositories;

import com.todo.todo.Models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoInterface extends CrudRepository<Todo, Long> {
}
