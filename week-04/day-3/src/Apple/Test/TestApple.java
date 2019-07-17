package Apple.Test;

import Apple.Apple;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApple {

  Apple apple = new Apple();

  @Test
  public void shouldGetApple() {
    String expected = "alma";
    assertEquals(expected, apple.getApple());
  }

}
