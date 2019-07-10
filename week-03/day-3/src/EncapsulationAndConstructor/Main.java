package EncapsulationAndConstructor;

public class Main {
  public static void main (String[] args){
    Animal kutymuty = new Animal();
    kutymuty.eat();
    System.out.println(kutymuty.hunger);
    kutymuty.drink();
    System.out.println(kutymuty.thirst);
    kutymuty.play();
    System.out.println(kutymuty.hunger);
    System.out.println(kutymuty.thirst);

    Sharpie sharpieMarker = new Sharpie();
    sharpieMarker.color = "Blue";
    sharpieMarker.width = 24;
    for (int i = 0; i < 15; i++) {
      sharpieMarker.use();
    }
    System.out.println(sharpieMarker.inkAmount);

  }
}
//Create an Animal class
//Every animal has a hunger value, which is a whole number
//Every animal has a thirst value, which is a whole number
//when creating a new animal object these values are created with the default 50 value
//Every animal can eat() which decreases their hunger by one
//Every animal can drink() which decreases their thirst by one
//Every animal can play() which increases both by one