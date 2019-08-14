package com.playing.w.colors.colors.controllers;
import com.playing.w.colors.colors.interfaces.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ColorController {
  private MyColor myColor;

  @Autowired
  ColorController(MyColor myColor) {
    this.myColor= myColor;
  }

  @RequestMapping("")
  @ResponseBody
  public String foo(){
    myColor.printColor();
    return "name";
  }
}
