package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  ElectricGuitar(){
    this.numberOfStrings = 6;
    this.name = "Electric Guitar";
  }

  ElectricGuitar(int numberOfString) {
    this.numberOfStrings = numberOfString;
    this.name = "Electric Guitar";
  }

  @Override
  public void sound() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes Twang.");
  }
}
