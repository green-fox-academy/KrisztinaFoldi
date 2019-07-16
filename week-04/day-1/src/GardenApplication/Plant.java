package GardenApplication;

public class Plant {
  private String color;
  private int thirstLevel;
  private int waterLevel;

  public String getColor() {
    return color;
  }

  public int getThirstLevel() {
    return thirstLevel;
  }

  public Plant(){
  }

  public Plant(String color, int thirst){
    this.color = color;
    this.thirstLevel = thirstLevel;
  }

  public void waterig(int number) {
    this.waterLevel += number;
  }

  public void isThirsty() {
    if (waterLevel < thirstLevel) {
      System.out.println("The " + getColor() + " Flower needs water.");
    } else {
      System.out.println("The " + getColor() + " Flower doesn't need water.");
    }
  }

}
