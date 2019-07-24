import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    System.out.println(isAnagram("dog", "god"));
  }

  public static boolean isAnagram(String word1, String word2){
    char[] newWord1 = word1.toCharArray();
    char[] newWord2 = word2.toCharArray();
    Arrays.sort(newWord1);
    Arrays.sort(newWord2);
    String newNewWord1 = new String(newWord1);
    String newNewWord2 = new String(newWord2);
    return (newNewWord1.equalsIgnoreCase(newNewWord2));
  }
}
//Create a function named is anagram following your current language's style guide.
// It should take two strings and return a boolean value depending on whether its an anagram or not.