package com.todolistmysql.mysqltodo.controllers;
import com.todolistmysql.mysqltodo.models.Assignee;
import com.todolistmysql.mysqltodo.repositories.AssigneeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo/assignees")
public class AssigneeController {

  AssigneeRepo assigneeRepo;

  @Autowired
  public AssigneeController(AssigneeRepo assigneeRepo) {
    this.assigneeRepo = assigneeRepo;
  }

  @GetMapping
  public String assigneesList(Model model) {
    model.addAttribute("assignee", assigneeRepo.findAll());
    model.addAttribute("assignee", new Assignee());
    return "assignees";
  }

//  @GetMapping("/")
////  public String renderSaveAss(Model model) {
////    model.addAttribute("assignee", new Assignee());
////    return "assignees";
////  }

  @PostMapping
  public String saveAss(@ModelAttribute Assignee newAss) {
    if(newAss.getName() != null && newAss.getEmail() != "") {
      assigneeRepo.save(newAss);
    }
    return "redirect:/todo/assignees";
  }

  @GetMapping("/{id}/edit")
  public String renderAssigneeEditor(@PathVariable("id") Long id, Model model) {
    model.addAttribute("assignee", assigneeRepo.findById(id));
    model.addAttribute("id", id);
    return "editassignees";
  }

  @PostMapping("/{id}/edit")
  public String assigneeEditor(@PathVariable("id") Long id,
                               @ModelAttribute Assignee editedAssignee) {
    assigneeRepo.save(editedAssignee);
    return "redirect:/todo/assignees";
  }

}
