package GreenFox;

public class Sponsor extends Person {
  private String company = "Google";
  private int hiredStudents;

  public Sponsor() {
  }

  public Sponsor(String name, int age, String gender, String company){
    super(name, age, gender);
    this.company = company;
    hiredStudents = 0;
  }

  @Override
  public void introduce(){
    System.out.println("Hi, I'm " + getName() + " , a " + getAge() + " year old " + getGender()+ " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  @Override
  public void getGoal(){
    System.out.println("Hire brilliant junior software developers.");
  }
  public void hire() {
    hiredStudents++;
  }
}
//Create a Sponsor class that has the same fields and methods as the Person class, and has the following additional
//
//fields:
//company: name of the company
//hiredStudents: number of students hired
//method:
//introduce(): "Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far."
//hire(): increase hiredStudents by 1
//getGoal(): prints out "Hire brilliant junior software developers."
//The Sponsor class has the following constructors:
//
//Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
//Sponsor(): sets name to Jane Doe, age to 30, gender to female, company to Google and hiredStudents to 0