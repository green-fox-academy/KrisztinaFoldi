package com.webshop.krisztifoldi.firstwebshop.Controllers;
import com.webshop.krisztifoldi.firstwebshop.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Controller
public class mainController {
  List<ShopItem> items = new ArrayList<>();


  public List<ShopItem> fillTheListWithItems() {
    ShopItem runningShoes = new ShopItem("Running shoes", "Nike running shoes for every day sport", 100, 5);
    ShopItem printer = new ShopItem("Printer", "Some HP printer that will print pages", 300, 2);
    ShopItem cocaCola = new ShopItem("Coca Cola", "0,5l standard coke", 3, 0);
    ShopItem tShirt = new ShopItem("T-Shirt", "Blue with a corgie on a bike", 20, 1);
    items.add(runningShoes);
    items.add(printer);
    items.add(cocaCola);
    items.add(tShirt);
    return items;
  }


  @GetMapping("")
  public String mainPage(Model model){
    items.clear();
    fillTheListWithItems();
    model.addAttribute("items" , items);
    return "webshop";
  }

  @GetMapping("/only-available")
  public String availablePage(Model model){
    items.clear();
    fillTheListWithItems();
    List<ShopItem> availableItems = items
            .stream().filter(x -> x.getQuantityOfStock() > 0)
            .collect(Collectors.toList());
    model.addAttribute("items" , availableItems);
    return "webshop";
  }





}
