import java.util.ArrayList;

public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34, 234, 133, 234, 65}));
    //  should print: `[1, 11, 34, 52, 61]`
  }

  public static ArrayList<Integer> unique(int[] listOfNumbers) {
    ArrayList<Integer> uniqueListOfNumbers = new ArrayList<>();
    for (int i = 0; i < listOfNumbers.length; i++) {
      if (uniqueListOfNumbers.contains(listOfNumbers[i])) {
        continue;
      } else {
        uniqueListOfNumbers.add(listOfNumbers[i]);
      }
    }
    return uniqueListOfNumbers;
  }
}