package com.example.restapidemo.models;
import org.springframework.stereotype.Component;

@Component
public class Word {
  private String appended;

  public Word() {
  }

  public Word(String appended) {
    this.appended = appended + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
