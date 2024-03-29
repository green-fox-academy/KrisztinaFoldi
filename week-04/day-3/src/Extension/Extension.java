package Extension;
import java.util.*;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  public int add(int a, int b) {
    return a + b;
  }

  public int maxOfThree(int a, int b, int c) {
    if (a > b && a > c)
      return a;
    else if (b > a && b > c)
      return b;
    else
      return c;
  }

  public float median(List<Integer> pool) {
    Collections.sort(pool);
    if(pool.size() % 2 != 0) {
      return pool.get((pool.size() - 1) / 2);
    } else {
      return (float)(pool.get((pool.size() - 1) / 2) + pool.get(pool.size() / 2)) / 2;
    }
  }



  public boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(Character.toLowerCase(c));
  }

  public String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split(""+c));
        i+=2;
        length+=2;
      }
    }
    return teve;
  }
}

// Check out the folder. There's a work file and a test file.

//  -  Run the tests, all 10 should be green (passing).
//  -  The implementations though are not quite good.
//  -  Create tests that'll fail, and will show how the implementations are wrong(You can assume that the implementation
//  of join and split are good)
//  -  After creating the tests, fix the implementations
//  -  Check again, if you can create failing tests
//  -  Implement if needed