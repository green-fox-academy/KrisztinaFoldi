package com.example.restapidemo.models;

import org.springframework.stereotype.Component;

@Component
public class Factorial {
  private int until;
  private int result;

  public Factorial(int until) {
    this.until = until;
    for (int i = 0; i < until; i++) {
      this.result *= i;
    }
  }

  public Factorial() {
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
