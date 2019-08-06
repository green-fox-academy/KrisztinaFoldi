package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;


@Controller
public class HelloWebController {
  AtomicLong number = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name") String name) {
    long theValue = number.incrementAndGet();
    model.addAttribute("name", name);
    model.addAttribute("counter", theValue );
    return "greeting";
  }
}
