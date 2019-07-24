import java.util.ArrayList;

public class SubInt {
  public static void main(String[] args) {
    //  Create a function that takes a number and an array of integers as a parameter
    //  Returns the indices of the integers in the array of which the first number is a part of
    //  Or returns an empty array if the number is not part of any of the integers in the array

    //  Example:
    System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61, 123, 678, 341}));
    //  should print: `[0, 1, 4]`
    System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
    //  should print: '[]'
  }
  
  public static ArrayList<Integer> subInt(int number, int[] integers){
    String[] stringArray = new String[integers.length];
    String stringNumber = Integer.toString(number);
    ArrayList<Integer> index = new ArrayList<>();
    for (int i = 0; i < integers.length ; i++) {
      stringArray[i] = String.valueOf(integers[i]);
      if(stringArray[i].contains(stringNumber)) {
        index.add(findIndex(stringArray[i], stringArray));
      }
    }
    return index;
  }

  public static int findIndex(String element, String[] strNewArray) {
    for (int i = 0; i < strNewArray.length ; i++) {
      if (strNewArray[i] == element) {
        return i;
      }
    }
    return -1;
  }
}
