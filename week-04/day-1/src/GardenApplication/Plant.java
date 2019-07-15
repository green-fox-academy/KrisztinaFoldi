package GardenApplication;

public class Plant {
  private String color;
  private int thirst;

  public String getColor() {
    return color;
  }

  public int getThirst() {
    return thirst;
  }

  public Plant(){
  }

  public Plant(String color, int thirst){
    this.color = color;
    this.thirst = thirst;
  }

  public void waterig(int number) {
    this.thirst += number;
  }

  public void isThirsty() {

  }

}
