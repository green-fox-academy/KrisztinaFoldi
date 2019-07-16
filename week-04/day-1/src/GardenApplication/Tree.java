package GardenApplication;

public class Tree extends Plant{
  private int waterLevel;

  public Tree(String color, int thirstLevel){
    super(color, thirstLevel);
  }

  public void watering(int number) {
    this.waterLevel += number * 0.4;
  }

  @Override
  public void isThirsty(){
    if (waterLevel < 10) {
      System.out.println("The " + getColor() + " Tree needs water.");
    } else {
      System.out.println("The " + getColor() + " Tree doesn't need water.");
    }
  }
}
