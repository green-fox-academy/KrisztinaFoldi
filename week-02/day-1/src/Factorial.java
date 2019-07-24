public class Factorial {
  public static void main(String[] args){

    System.out.println(factorio(1));

  }

  public static int factorio(int number) {
    int factorial = 1;
    for (int i = 2; i <= number; i++) {
     factorial *= i;
    }
    return factorial;
  }
}
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial