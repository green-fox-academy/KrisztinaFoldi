package CountLetters.CountLettersTest;

import CountLetters.CountLetters;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersTest {
  CountLetters word = new CountLetters();

  @Test
  void makeADictionaryFromLettersOfAWordTest() {
    HashMap<Character, Integer> testHashMap = new HashMap<>();
    testHashMap.put('a', 2);
    testHashMap.put('l', 1);
    testHashMap.put('m', 1);

    assertEquals(testHashMap, word.makeADictionaryFromLettersOfAWord(word.alma));
  }

}
