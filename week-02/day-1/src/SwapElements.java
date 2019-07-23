import java.util.Arrays;

public class SwapElements {
  public static void main(String[] args) {
    String[] abc = {"first", "second", "third"};
    String newABC = abc[0];
    abc[0] = abc[2];
    abc[2] = newABC;

    for(String n : abc) {
      System.out.println(n);
    }
  }
}
// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`