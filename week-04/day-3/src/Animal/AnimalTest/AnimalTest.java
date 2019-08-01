package Animal.AnimalTest;
import Animal.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AnimalTest {
  Animal kiskutya = new Animal();
  Animal cica = new Animal();

  @Test
  void eatShouldDecreaseHungerAmount() {
    kiskutya.eat();
    assertEquals(49, kiskutya.hunger);
  }

  @Test
  void playShouldIncreaseThirst() {
    kiskutya.play();
    assertEquals(51, kiskutya.thirst);
  }

  @Test
  void playShouldIncreaseHunger() {
    kiskutya.play();
    assertEquals(51, kiskutya.hunger);
  }

  @Test
  void drinkShouldDecreaseThirstAmount() {
    kiskutya.drink();
    assertEquals(49, kiskutya.thirst);
  }

  @Test
  void playShouldNotDecreaseThirst() {
    kiskutya.play();
    assertNotEquals(49, kiskutya.thirst);
  }
}
