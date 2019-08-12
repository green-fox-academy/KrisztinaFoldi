package com.greenfox.worshop.thymeleaf.controllers;
import com.greenfox.worshop.thymeleaf.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
  List<BankAccount> listOfBankAccounts = new ArrayList<>();

  public MainController() {
    makeAList();
  }

  public List<BankAccount> makeAList(){
    BankAccount lion = new BankAccount("Simba", 2000, "lion");
    listOfBankAccounts.add(lion);
    return listOfBankAccounts;
  }

  @RequestMapping("/show")
  public String showOneAccount(Model model) {
    model.addAttribute("items", listOfBankAccounts);
    return "index";
  }

  @RequestMapping("/enjoy")
  public String showUText() {
   return "htmlception";
  }

}
