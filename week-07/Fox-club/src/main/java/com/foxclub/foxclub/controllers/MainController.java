package com.foxclub.foxclub.controllers;
import com.foxclub.foxclub.model.FindFox;
import com.foxclub.foxclub.model.Fox;
import com.foxclub.foxclub.model.Foxes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
  Foxes foxes;
  FindFox fox;


  @Autowired
  public MainController(Foxes foxes, FindFox fox) {
    this.foxes = foxes;
    this.fox = fox;
  }

  @RequestMapping("/")
  public String goLogin(@RequestParam(value = "name", required = false) String name, Model model) {
    if(name == null || name.equals("")) {
      return "redirect:/login";
    } else {
      model.addAttribute("fox", fox.foxFinder(foxes, name));
    }
    return "index";
  }

//  @RequestMapping("/")
//  public String goToInfoPage() {
//    return "index";
//  }


  @GetMapping("/login")
  public String goToLogin() {
    return "login";
  }

  @PostMapping(value="/login")
  public String foxPage(@RequestParam("username") String userName) {
    return "redirect:/?name=" + userName;
  }

  @RequestMapping("/nutritionStore")
  public String nutritionStore() {
    return "nutrition";
  }
}
