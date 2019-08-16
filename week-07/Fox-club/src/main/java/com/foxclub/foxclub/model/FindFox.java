package com.foxclub.foxclub.model;
import org.springframework.stereotype.Service;

@Service
public class FindFox {
  public Fox foxFinder(Foxes foxes, String name) {
    Fox foxTemp = null;
    for (Fox fox : foxes.getFoxes()) {
      if (fox.getName().equals(name)) {
        foxTemp = fox ;
        break;
      }
    } if (foxTemp==null) {
      foxTemp = new Fox(name);
      foxes.addFox(foxTemp);
    }
    return foxTemp;
  }
}

