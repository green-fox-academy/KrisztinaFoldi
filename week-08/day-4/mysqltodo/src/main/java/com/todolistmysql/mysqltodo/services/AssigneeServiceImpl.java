package com.todolistmysql.mysqltodo.services;
import com.todolistmysql.mysqltodo.models.Assignee;
import com.todolistmysql.mysqltodo.repositories.AssigneeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AssigneeServiceImpl implements AssigneeService {
  AssigneeRepo assigneeRepo;

  @Autowired
  public AssigneeServiceImpl(AssigneeRepo assigneeRepo) {
    this.assigneeRepo = assigneeRepo;
  }

  @Override
  public List<Assignee> findAll() {
    return assigneeRepo.findAll();
  }

  @Override
  public void save(Assignee newAssignee) {
    assigneeRepo.save(newAssignee);
  }

  @Override
  public Assignee findAssignee(Long id) {
    Optional<Assignee> dbAssignee = assigneeRepo.findById(id);
    return dbAssignee.orElse(null);
    }

  @Override
  public void update(Long id, String name, String email) {
    Assignee assigneeToUpdate = findById(id);
    assigneeToUpdate.setName(name);
    assigneeToUpdate.setEmail(email);
    assigneeRepo.save(assigneeToUpdate);
  }

  @Override
  public Assignee findById(Long id) {
    if (assigneeRepo.findById(id).isPresent()) {
      return assigneeRepo.findById(id).get();
    } else
      return null;
  }

  @Override
  public void deleteAssignee(Long id) {
    Assignee assignee = findById(id);
    assigneeRepo.delete(assignee);
  }
}
