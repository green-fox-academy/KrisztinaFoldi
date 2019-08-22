package com.todo.todo.Controllers;
import com.todo.todo.Repositories.TodoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/todo")
public class TodoController {

  TodoInterface todoInterface;

  @Autowired
  public TodoController(TodoInterface todoInterface) {
    this.todoInterface = todoInterface;
  }

  @RequestMapping(value = { "/" , "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoInterface.findAll());
    return "todolist";
  }
}
