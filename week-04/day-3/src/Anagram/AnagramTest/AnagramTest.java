package Anagram.AnagramTest;
import Anagram.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AnagramTest {
  Anagram anagram = new Anagram();


  @Test
  public void areThoseWordsAnagrams(){
    assertEquals(true, anagram.isAnagram(anagram.anagram1, anagram.anagram2));
  }


}
