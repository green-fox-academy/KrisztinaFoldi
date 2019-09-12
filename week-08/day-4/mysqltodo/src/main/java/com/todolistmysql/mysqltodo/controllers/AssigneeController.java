package com.todolistmysql.mysqltodo.controllers;
import com.todolistmysql.mysqltodo.models.Assignee;
import com.todolistmysql.mysqltodo.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo/assignees")
public class AssigneeController {

  private AssigneeService assigneeService;

  @Autowired
  public AssigneeController(AssigneeService assigneeService) {
    this.assigneeService = assigneeService;
  }

  @GetMapping
  public String assigneesList(Model model) {
    model.addAttribute("assignee", assigneeService.findAll());
//    model.addAttribute("assignee", new Assignee());
    return "assignees";
  }

//  @GetMapping("/")
////  public String renderSaveAss(Model model) {
////    model.addAttribute("assignee", new Assignee());
////    return "assignees";
////  }

  @PostMapping
  public String saveAss(@ModelAttribute Assignee newAss) {
    if(newAss.getName() != null && ! newAss.getEmail().equals("")) {
      assigneeService.save(newAss);
    }
    return "redirect:/todo/assignees";
  }

  @GetMapping("/{id}/edit")
  public String renderAssigneeEditor(@PathVariable("id") Long id, Model model) {
    model.addAttribute("assignee", assigneeService.findAssignee(id));
    model.addAttribute("id", id);
    return "editassignees";
  }

  @PostMapping("/{id}/edit")
  public String assigneeEditor(@PathVariable("id") Long id,
                               @RequestParam String name, @RequestParam String email) {
   assigneeService.update(id, name, email);
   return "redirect:/todo/assignees";
  }

  @GetMapping("/{id}/delete")
  public String deleteAssignee(@PathVariable Long id) {
    assigneeService.deleteAssignee(id);
    return "redirect:/todo/assignees";
  }
}
