package main.java.music;

public class Violin extends StringedInstrument{
  Violin(){
    this.numberOfStrings = 4;
    this.name = "Violin";
  }

  Violin(int numberOfString) {
    this.numberOfStrings = numberOfString;
    this.name = "Violin";
  }

  @Override
  public void sound() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes Screech");
  }
}
