package Cloneable;

import GreenFox.Person;

public class Student extends Person implements Cloneable{
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

  @Override
  protected Student clone() {
//    return this;
//    Student student = new Student(getName(), getAge(), getGender(), previousOrganization)
//    return student;
    return new Student(getName(), getAge(), getGender(), previousOrganization);
  }
}

