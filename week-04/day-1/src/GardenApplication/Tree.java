package GardenApplication;

public class Tree extends Plant{
  private int thirst;

  public Tree(String color, int thirst){
    super(color, thirst);
  }

  public void watering(int number) {
    this.thirst += number * 0.4;
  }

  @Override
  public void isThirsty(){
    if (getThirst() < 10) {
      System.out.println("The " + getColor() + " Tree needs water.");
    } else {
      System.out.println("The " + getColor() + " Tree doesn't need water.");
    }
  }
}
