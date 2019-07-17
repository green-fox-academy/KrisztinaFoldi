package Sum.SumTest;
import Sum.Sum;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

  Sum sum = new Sum();

  @Test
  public void shouldGetZeroWithEmptyList() {
    assertEquals(0, sum.sumArrayList(sum.wut));
  }

  @Test
  public void sumWithOnlyOneElementTest() {
    sum.wut.add(5);
    assertEquals(5, sum.sumArrayList(sum.wut));
  }

  @Test
  public void sumWithMoreThanOneElementTest() {
    sum.wut.add(10);
    sum.wut.add(4);
    assertEquals(14, sum.sumArrayList(sum.wut));
  }

  @Test
  public void sumEmptyListTest() {
    assertEquals(0, sum.sumArrayList(null));
  }
}
