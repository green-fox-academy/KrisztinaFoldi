package Extension.ExtensionTest;
import Extension.Extension;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(4, extension.add(2, 2));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(3, extension.add(1, 2));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(112, extension.maxOfThree(20, 112, 15));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(20, extension.maxOfThree(3, 20, 5));
  }

  @Test
  void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(7,8,3,1)));
  }

  @Test
  void testMedian_five() {
    assertEquals(4, extension.median(Arrays.asList(9,2,3,4,5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('A'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("avalmavafava", extension.translate("almafa"));
  }

  @Test
  void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}