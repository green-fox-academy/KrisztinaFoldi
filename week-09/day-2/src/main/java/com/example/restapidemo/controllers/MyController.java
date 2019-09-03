package com.example.restapidemo.controllers;

import com.example.restapidemo.models.HibaUzi;
import com.example.restapidemo.models.Received;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @GetMapping("/doubling")
  public ResponseEntity doubling(@RequestParam(value = "input", required = false) Integer input){
    if (input != null) {
      return ResponseEntity.status(200).body(new Received(input));
    } else {
      return ResponseEntity.status(200).body(new HibaUzi("Please provide an input!"));
    }
  }
}
