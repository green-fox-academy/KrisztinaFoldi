package com.todolistmysql.mysqltodo.repositories;
import com.todolistmysql.mysqltodo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByDone(boolean isActive);
  List<Todo> findAllByTitle(String title);
  List<Todo> findAll();
}
