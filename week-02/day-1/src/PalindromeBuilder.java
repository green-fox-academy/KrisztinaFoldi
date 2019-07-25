public class PalindromeBuilder {
  public static void main(String[] args) {
    System.out.println(createPalindrome("greenfox"));

  }

  public static String createPalindrome(String input) {
    String original = input;
    String reverse = "";
    for(int i = input.length() - 1; i >= 0; i--) {
    reverse += original.charAt(i);
    }
    return original + reverse;
}
}
//Create a function named create palindrome following your current language's style guide.
// It should take a string, create a palindrome from it and then return it.