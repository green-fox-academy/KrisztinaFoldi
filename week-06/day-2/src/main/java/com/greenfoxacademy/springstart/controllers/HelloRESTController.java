package com.greenfoxacademy.springstart.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class HelloRESTController {
  AtomicLong number = new AtomicLong();

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam(value = "name") String name) {
    long theValue = number.incrementAndGet();
    Greeting firstGreeting = new Greeting(theValue, "Hello " + name + "!");
    return firstGreeting;
  }
}
