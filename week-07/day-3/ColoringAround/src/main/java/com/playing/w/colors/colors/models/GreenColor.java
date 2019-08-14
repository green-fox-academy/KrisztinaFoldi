package com.playing.w.colors.colors.models;

import com.playing.w.colors.colors.interfaces.MyColor;
import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {
  @Override
  public String printColor() {
    return "It is green in color...";
 }
}
