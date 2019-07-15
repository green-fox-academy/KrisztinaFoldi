package GardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  public static void main(String[] args) {
    List<Plant> garden = new ArrayList<>();

    Flower yellowFlower = new Flower("yellow", 0);
    garden.add(yellowFlower);
    Flower blueFlower = new Flower("blue", 0);
    garden.add(blueFlower);
    Tree purpleTree = new Tree("purple", 0);
    garden.add(purpleTree);
    Tree orangeTree = new Tree("orange", 0);
    garden.add(orangeTree);

    for (int i = 0; i < garden.size() ; i++) {
      garden.get(i).isThirsty();
    }
//    yellowFlower.isThirsty();
//    blueFlower.isThirsty();
//    purpleTree.isThirsty();
//    orangeTree.isThirsty();



  }


}
