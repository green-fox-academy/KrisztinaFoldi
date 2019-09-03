package com.example.restapidemo.models;

import org.springframework.stereotype.Component;

@Component
public class Welcome {
  private String welcome_message;


  public Welcome() {
  }

  public Welcome(String name, String title) {
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
