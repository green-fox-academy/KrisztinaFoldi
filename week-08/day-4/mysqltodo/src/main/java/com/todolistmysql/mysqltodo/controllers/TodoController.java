package com.todolistmysql.mysqltodo.controllers;
import com.todolistmysql.mysqltodo.models.Todo;
import com.todolistmysql.mysqltodo.repositories.TodoRepository;
import com.todolistmysql.mysqltodo.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value="/todo")
public class TodoController {

  TodoRepository todoRepository;
  AssigneeService assigneeService;

  @Autowired
  public TodoController(TodoRepository todoRepository, AssigneeService assigneeService) {
    this.todoRepository = todoRepository;
    this.assigneeService = assigneeService;
  }

  @RequestMapping("/list")
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }

  @GetMapping("/")
  public String isDone(Model model, @RequestParam(value = "isActive", required = false) boolean status){
    if(status) {
       model.addAttribute("todos", todoRepository.findAllByDone(status));
    } else {
      model.addAttribute("todos", todoRepository.findAllByDone(status));
    }
    return "todolist";
  }

  @GetMapping("/add")
  public String renderAddTodo(Model model) {
    model.addAttribute("todo", new Todo());
    return "add-todo";
  }

  @PostMapping("/add")
  public String addTodo(@ModelAttribute Todo newTodo) {
    if(newTodo.getTitle() != null && newTodo.getTitle() != "") {
      todoRepository.save(newTodo);
    }
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable long id) {
    todoRepository.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String renderEditing(@PathVariable("id") long id, Model model) {
    model.addAttribute("todo", todoRepository.findById(id));
    model.addAttribute("assignees", assigneeService.findAll());
    model.addAttribute("id", id);
    return "edittodo";
  }

  @PostMapping("/{id}/edit")
  public String editing(@PathVariable("id") long id, @ModelAttribute Todo editedTodo) {

    todoRepository.save(editedTodo);
    return "redirect:/todo/list";
  }

  @PostMapping("/list")
  public String searching(@RequestParam(name = "search", required = false) String search, Model model) {
    model.addAttribute("todos", todoRepository.findAllByTitle(search));
    return "todolist";
  }

}
