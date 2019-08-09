package com.webshop.krisztifoldi.firstwebshop;

public class ShopItem {
  private String name;
  private String description;
  private int price;
  private int quantityOfStock;
  private String type;


  public ShopItem(String name,String type, String description, int price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  public String getType() { return type; }
}
