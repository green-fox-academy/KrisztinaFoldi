package com.example.restapidemo.models;

import org.springframework.stereotype.Component;

@Component
public class HibaUzi {

  private String error;

  public HibaUzi(String error) {
    this.error = error;
  }

  public HibaUzi() {
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
