package com.example.restapidemo.models;

import org.springframework.stereotype.Component;

@Component
public class Received {
  private int received;
  private int result;

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public Received(int received) {
    this.received = received;
    this.result = received * 2;
  }

  public Received() {
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }
}
