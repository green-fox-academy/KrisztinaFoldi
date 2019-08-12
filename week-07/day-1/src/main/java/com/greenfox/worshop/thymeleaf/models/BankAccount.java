package com.greenfox.worshop.thymeleaf.models;

import java.text.DecimalFormat;

public class BankAccount {
  String name;
  int balance;
  String animalType;

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }
}
