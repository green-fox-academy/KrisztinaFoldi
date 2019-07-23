import java.util.Arrays;

public class AppendA {
  public static void main(String[] args) {
    String[] animals = {"koal", "pand", "zebr"};
    addPlusAToTheEndOfWord(animals);
  }

  public static void addPlusAToTheEndOfWord(String[] array) {
//    Arrays.toString(array);
    for (int i = 0; i < array.length ; i++) {
      System.out.println(array[i] + "a");
    }
  }
}
// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end
