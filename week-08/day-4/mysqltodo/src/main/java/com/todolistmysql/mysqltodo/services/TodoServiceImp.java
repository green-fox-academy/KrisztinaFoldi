package com.todolistmysql.mysqltodo.services;
import com.todolistmysql.mysqltodo.models.Todo;
import com.todolistmysql.mysqltodo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoServiceImp implements TodoService {
  TodoRepository todoRepository;

  @Autowired
  public TodoServiceImp(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public List<Todo> getAllTodo() {
    return todoRepository.findAll();
  }
}
