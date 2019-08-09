package com.webshop.krisztifoldi.firstwebshop.Controllers;
import com.webshop.krisztifoldi.firstwebshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Controller
public class mainController {
  List<ShopItem> items = new ArrayList<>();

  public mainController() {
    fillTheListWithItems();
  }

  public List<ShopItem> fillTheListWithItems() {
    ShopItem runningShoes = new ShopItem("Running shoes", "Clothes and shoes", "Nike running shoes for every day sport", 100, 5);
    ShopItem printer = new ShopItem("Printer", "Electronics","Some HP printer that will print pages", 300, 2);
    ShopItem cocaCola = new ShopItem("Coca Cola", "Beverages", "0,5l standard coke", 3, 0);
    ShopItem tShirt = new ShopItem("T-Shirt", "Clothes and shoes" ,"Blue with a corgi on a bike", 20, 1);
    items.add(runningShoes);
    items.add(printer);
    items.add(cocaCola);
    items.add(tShirt);
    return items;
  }


  @GetMapping("")
  public String mainPage(Model model){
    model.addAttribute("items" , items);
    return "webshop";
  }

  @GetMapping("/only-available")
  public String availablePage(Model model){
    List<ShopItem> availableItems = items
            .stream().filter(x -> x.getQuantityOfStock() > 0)
            .collect(Collectors.toList());
    model.addAttribute("items" , availableItems);
    return "webshop";
  }

  @GetMapping("/cheapest-first")
  public String orderedPage(Model model){
    List<ShopItem> orderedItems = items
            .stream().sorted(Comparator.comparingInt(x -> x.getPrice()))
            .collect(Collectors.toList());
    model.addAttribute("items" , orderedItems);
    return "webshop";
  }

  @GetMapping("/contains-nike")
  public String containsNikePage(Model model) {
    List<ShopItem> nikeItems = items
            .stream().filter(x -> x.getName().contains("Nike") || x.getDescription().contains("Nike"))
            .collect(Collectors.toList());
    model.addAttribute("items", nikeItems);
    return "webshop";
  }

  @GetMapping("/average-stock")
  public String averageStockPage(Model model){
    double averageStock = items
            .stream().mapToDouble(x -> x.getQuantityOfStock())
            .average()
            .getAsDouble();
    model.addAttribute("average", "Average stock: " + averageStock);
    return "averageStock";
  }

  @GetMapping("/most-expensive")
  public String mostExpensivePage(Model model) {
    int max = items.stream()
            .mapToInt(x -> x.getPrice())
            .max()
            .getAsInt();
    String nameOfTheMax = items.stream()
            .filter(x -> x.getPrice() == max)
            .collect(Collectors.toList()).get(0).getName();
    model.addAttribute("average", "The most expensive available: " + nameOfTheMax);
    return "averageStock";
  }

  @PostMapping("/search")
  public String search(@RequestParam("search") String searchedWord, Model model) {
    List<ShopItem> searchedItems = items.stream()
            .filter(x -> x.getName().toLowerCase().contains(searchedWord.toLowerCase()) ||
                         x.getDescription().toLowerCase().contains(searchedWord.toLowerCase()))
            .collect(Collectors.toList());
    model.addAttribute("items", searchedItems);
    return "webshop";
  }

  @GetMapping("/webshop")
  public String getToHomePage(Model model) {
    model.addAttribute("items" , items);
    return "webshop";
  }

  @GetMapping("/more-filters")
  public String getToMoreFilteredPage(Model model) {
    model.addAttribute("items", items);
    return "moreFilters";
  }

  @RequestMapping("/filter-by-type")
  public String filterByTypePage(@RequestParam("filter") String type, @RequestParam("asf") String asf, Model model) {
    List<ShopItem> filteredList = items.stream()
            .filter(x -> x.getType().equals(type))
            .collect(Collectors.toList());
    model.addAttribute("items", filteredList);
    return "moreFilters";
  }


}
