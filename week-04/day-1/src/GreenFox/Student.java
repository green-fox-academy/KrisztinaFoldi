package GreenFox;

public class Student extends Person {
  private String previousOrganization = "The school of life";
  private int skippedDays;

  public Student(String name, int age, String gender,String previousOrganization){
    super(name, age, gender);
    int skippedDays = 0;
    this.previousOrganization = previousOrganization;
  }

  public Student() {
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer!");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + " a " + getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }
}
//Create a Student class that has the same fields and methods as the Person class, and has the following additional
//
//fields:
//previousOrganization: the name of the student’s previous company / school
//skippedDays: the number of days skipped from the course
//methods:
//getGoal(): prints out "Be a junior software developer."
//introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
//skipDays(numberOfDays): increases skippedDays by numberOfDays
//The Student class has the following constructors:
//
//Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
//Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0