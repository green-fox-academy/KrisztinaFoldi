package com.todolistmysql.mysqltodo.controllers;
import com.todolistmysql.mysqltodo.models.Todo;
import com.todolistmysql.mysqltodo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value="/todo")
public class TodoController {

  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping(value = "/list")
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

//  @GetMapping("/add-todo")
//  public String renderAddTodo(Model model) {
//    model.addAttribute("todo", new Todo());
//    return "add-todo";
//  }

  @RequestMapping("/addTodo")
  public String addTodo() {
    return "add-todo";
  }

  @PostMapping("/addTodo")
  public String newTodo(@RequestParam("newTodo") String todoName) {
    todoRepository.save(new Todo(todoName));
    return "redirect:/todo/";
  }
}
