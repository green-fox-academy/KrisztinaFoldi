package com.todolistmysql.mysqltodo.services;
import com.todolistmysql.mysqltodo.models.Todo;
import java.util.List;

public interface TodoService {
  List<Todo> getAllTodo();
}
