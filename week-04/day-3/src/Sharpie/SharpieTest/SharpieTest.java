package Sharpie.SharpieTest;
import Sharpie.Sharpie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;

public class SharpieTest {
  Sharpie sharpie = new Sharpie("blue", 3.4);

  @Test
  void useShouldDecreaseInkAmount() {
    assertEquals(99, sharpie.use());
  }

  @Test
  void useShouldNotDecreaseInkAmount() {
    assertNotEquals(100, sharpie.use());
  }

}
