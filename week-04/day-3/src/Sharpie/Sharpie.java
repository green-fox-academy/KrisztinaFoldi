package Sharpie;

import java.awt.*;

public class Sharpie {
  String color;
  double width;
  float inkAmount;

  public Sharpie(String color, double width) {
    this.inkAmount = 100;
    this.color = color;
    this.width = width;
  }

  public double use() {
    this.inkAmount --;
    return inkAmount;
  }
}
