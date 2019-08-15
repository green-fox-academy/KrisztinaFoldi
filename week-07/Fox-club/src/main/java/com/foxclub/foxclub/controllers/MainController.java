package com.foxclub.foxclub.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @RequestMapping("/")
  public String goHome(@RequestParam(value = "name", required = false) String name, Model model) {
    if(name == null || name.equals("")) {
      model.addAttribute("name", "Mr.Fox");
    } else {
      model.addAttribute("name", name);
    }
    return "index";
  }


  @GetMapping("/login")
  public String goToLogin() {
    return "login";
  }

  @PostMapping(value="/login")
  public String foxPage(@RequestParam("username") String userName) {
    return "redirect:/?name=" + userName;
  }
}
