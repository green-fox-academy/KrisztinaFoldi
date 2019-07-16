package main.java.music;

public abstract class StringedInstrument extends Instrument{
  int numberOfStrings;

  abstract public void sound();

  public void play(){
    sound();
  }
}
