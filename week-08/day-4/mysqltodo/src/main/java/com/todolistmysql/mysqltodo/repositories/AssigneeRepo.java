package com.todolistmysql.mysqltodo.repositories;
import com.todolistmysql.mysqltodo.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface AssigneeRepo extends CrudRepository<Assignee, Long> {
  List<Assignee> findAll();
  Optional<Assignee> findById(Long id);
}
