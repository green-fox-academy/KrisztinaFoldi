package EncapsulationAndConstructor;

public class Counter {
  int c = 0;
  int start;

  public Counter() {
    this.c = c;
  }

  public Counter(int start) {
    this.start = start;
    c = start;
  }

  public int add(int number){
    c += number;
    return number;
  }

  public int add() {
    c ++;
    return c;
  }

  public int get() {
    return this.c;
  }

  public void reset() {
    c = start;
  }
}
//  Create Counter class
//        which has an integer field value
//        when creating it should have a default value 0 or we can specify it when creating
//        we can add(number) to this counter another whole number
//        or we can add() without parameters just increasing the counter's value by one
//        and we can get() the current value
//        also we can reset() the value to the initial value