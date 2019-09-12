package com.todolistmysql.mysqltodo.services;

import com.todolistmysql.mysqltodo.models.Assignee;

import java.util.List;

public interface AssigneeService {
  List<Assignee> findAll();
  void save(Assignee newAssignee);
  Assignee findAssignee(Long id);
  void update(Long id, String name, String email);
  Assignee findById(Long id);
  void deleteAssignee(Long id);
}
