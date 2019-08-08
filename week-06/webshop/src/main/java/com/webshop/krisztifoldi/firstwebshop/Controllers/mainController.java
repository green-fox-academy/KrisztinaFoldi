package com.webshop.krisztifoldi.firstwebshop.Controllers;
import com.webshop.krisztifoldi.firstwebshop.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class mainController {
  ShopItem runningShoes = new ShopItem("Running shoes", "Nike running shoes for every day sport", 100, 5);
  ShopItem printer = new ShopItem("Printer", "Some HP printer that will print pages", 300, 2);
  ShopItem cocaCola = new ShopItem("Coca Cola", "0,5l standard coke", 3, 0);
  ShopItem tShirt = new ShopItem("T-Shirt", "Blue with a corgie on a bike", 20, 1);

  public List<ShopItem> fillTheListWithItems() {
    List<ShopItem> items = new ArrayList<>();
    items.add(runningShoes);
    items.add(printer);
    items.add(cocaCola);
    items.add(tShirt);
    return items;
  }


  @GetMapping("")
  public String mainPage(Model model){
    fillTheListWithItems();
    model.addAttribute("name" , runningShoes.getName());
    return "webshop";
  }







}
