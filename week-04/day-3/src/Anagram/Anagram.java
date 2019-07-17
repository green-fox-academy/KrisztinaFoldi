package Anagram;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
  public String anagram1 = "tal";
  public String anagram2 = "lat";


  public boolean isAnagram(String anagram1, String anagram2){
    char[] anagram1Characters = anagram1.toCharArray();
    char[] anagram2Characters = anagram2.toCharArray();
    Arrays.sort(anagram1Characters);
    Arrays.sort(anagram2Characters);
    String s1 = new String(anagram1Characters);
    String s2 = new String(anagram2Characters);
    if (s1.equals(s2)) {
      return true;
    }return false;
  }
}
