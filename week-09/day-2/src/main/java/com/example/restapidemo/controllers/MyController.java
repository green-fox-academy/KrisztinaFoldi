package com.example.restapidemo.controllers;

import com.example.restapidemo.models.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.Number;

@RestController
public class MyController {

  @GetMapping("/doubling")
  public ResponseEntity doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      return ResponseEntity.status(200).body(new Received(input));
    } else {
      return ResponseEntity.status(200).body(new HibaUzi("Please provide an input!"));
    }
  }

  @GetMapping("greeter")
  public ResponseEntity greeting(@RequestParam(value = "name", required = false) String name,
                                 @RequestParam(value = "title", required = false) String title) {
    if (name != null && title != null) {
      return ResponseEntity.status(200).body(new Welcome(name, title));
    } else if (name == null && title == null) {
      return ResponseEntity.status(200).body(new HibaUzi("Please provide a name and a title!"));
    } else if (name == null) {
      return ResponseEntity.status(200).body(new HibaUzi("Please provide a name!"));
    } else {
      return ResponseEntity.status(200).body(new HibaUzi("Please provide a title!"));
    }
  }

  @GetMapping("appenda/{appendable}")
  public ResponseEntity appenda(@PathVariable(value = "appendable") String appendable) {
    return ResponseEntity.status(200).body(new Word(appendable));
  }

  @PostMapping("dountil/{action}")
  private ResponseEntity dountil(@PathVariable("action") String action,
                                 @RequestBody DoUntil doUntil) {
    if (action.equals("sum")) {
      Integer result = 0;
      for (int i = 0; i <= doUntil.getUntil(); i++) {
        result += i;
      }
      doUntil.setResult(result);
      return ResponseEntity.status(200).body(new DoUntil(doUntil.getUntil(), result));
    } else if (action.equals("factor")) {
      Integer factorialResult = 1;
      for (int i = 1; i <= doUntil.getUntil(); i++) {
        factorialResult = factorialResult * i;
      }
      return ResponseEntity.status(200).body(new DoUntil(doUntil.getUntil(), factorialResult));
    } else {
      return ResponseEntity.status(200).body(new HibaUzi("Please provide a number!"));
    }
  }
}
