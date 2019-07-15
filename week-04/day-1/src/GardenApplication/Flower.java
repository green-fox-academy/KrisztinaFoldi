package GardenApplication;

public class Flower extends Plant {
  private int thirst = 0;

  public Flower(String color, int thirst) {
    super(color, thirst);
  }

  public Flower(){
  }

  public void watering(int number) {
    this.thirst += number * 0.75;
  }

@Override
  public void isThirsty(){
    if (thirst < 5) {
      System.out.println("The " + getColor() + " Flower needs water.");
    } else {
      System.out.println("The " + getColor() + " Flower doesn't need water.");
    }
  }
}
