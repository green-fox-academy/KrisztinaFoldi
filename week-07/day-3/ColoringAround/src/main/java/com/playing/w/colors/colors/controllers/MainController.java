package com.playing.w.colors.colors.controllers;
import com.playing.w.colors.colors.services.UtilityService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
  UtilityService utilityService;

  @Autowired
  public MainController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @RequestMapping("/useful")
  public String useful() {
    return "index";
  }

  @RequestMapping("/useful/colored-background")
  public String colored(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }
}
