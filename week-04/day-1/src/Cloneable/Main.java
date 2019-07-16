package Cloneable;

public class Main implements Cloneable {
  public static void main (String[] args) {
    Student john = new Student("John", 20, "male", "BME");
    Student johnTheClone = john.clone();

    johnTheClone.introduce();
    john.introduce();

  }
}
