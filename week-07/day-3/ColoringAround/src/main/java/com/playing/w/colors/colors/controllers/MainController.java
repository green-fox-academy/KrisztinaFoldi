package com.playing.w.colors.colors.controllers;
import com.playing.w.colors.colors.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

  @RequestMapping("useful/email-validator")
  public String email(@RequestParam("emailToCheck") String emailToCheck, Model model) {
    model.addAttribute("email", utilityService.validateEmail(emailToCheck));
    return "email";
  }
}
