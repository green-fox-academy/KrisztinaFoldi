package GreenFox;

public class Person {
  private String name = "Jane Doe";
  private int age = 30;
  private String gender = "female";

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public Person() {
  }

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + ".");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}
//Create a Person class with the following fields:
//
//name: the name of the person
//age: the age of the person (whole number)
//gender: the gender of the person (male / female)
//And the following methods:
//
//introduce(): prints out "Hi, I'm name, a age year old gender."
//getGoal(): prints out "My goal is: Live for the moment!"
//And the following constructors:
//
//Person(name, age, gender)
//Person(): sets name to Jane Doe, age to 30, gender to female