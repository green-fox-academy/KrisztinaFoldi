package com.playing.w.colors.colors.models;
import com.playing.w.colors.colors.interfaces.MyColor;
import org.springframework.stereotype.Service;


public class BlueColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is blue in color...");
  }
}
