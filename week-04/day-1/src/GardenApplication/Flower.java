package GardenApplication;

public class Flower extends Plant {
  private int waterLevel = 0;

  public Flower(String color, int thirstLevel) {
    super(color, thirstLevel);
  }

  public Flower(){
  }

  public void watering(int number) {
    this.waterLevel += number * 0.75;
  }

@Override
  public void isThirsty(){
    if (waterLevel < 5) {
      System.out.println("The " + getColor() + " Flower needs water.");
    } else {
      System.out.println("The " + getColor() + " Flower doesn't need water.");
    }
  }
}
