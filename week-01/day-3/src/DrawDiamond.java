import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a number! : ");
    int diamondHeight = scanner.nextInt();


    for(int i = 0; i < diamondHeight; i++) {

      for(int j = diamondHeight - 1; j >= i; j--) {
        System.out.print(" ");
      }

      for(int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    for(int i = diamondHeight; i > 0; i--) {

      for(int j = 0; j < diamondHeight - i; j++) {
        System.out.print(" ");
      }

      for (int k = 1; k <= i ; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}

// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was