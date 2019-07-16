package main.java.music;

public class BassGuitar extends StringedInstrument {
  BassGuitar(){
    this.numberOfStrings = 4;
    this.name = "Bass Guitar";
  }

  BassGuitar(int numberOfString) {
    this.numberOfStrings = numberOfString;
    this.name = "Bass Guitar";
  }

  @Override
  public void sound() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes Duum-duum-duum");
  }
}
