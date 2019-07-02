import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {
        //Create a list ('List A') which contains the following values
        //Apple, Avocado, Blueberries, Durian, Lychee
        ArrayList<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

//Create a new list ('List B') with the values of List A
        ArrayList<String> listB = new ArrayList<>(listA);

//Print out whether List A contains Durian or not
        System.out.println(listA.contains("Durian"));
//Remove Durian from List B
        listB.remove("Durian");
        System.out.println(listB);
//Add Kiwifruit to List A after the 4th element
        listA.add(4, "Kiwifruit");
        System.out.println(listA);
//Compare the size of List A and List B
        System.out.println("List Sizes:");
        System.out.println(listA.size());
        System.out.println(listB.size());
//Get the index of Avocado from List A

        System.out.println("Index of Avocado is: " + listA.indexOf("Avocado"));
//Get the index of Durian from List B
        System.out.println(listB.indexOf("Durian"));
//Add Passion Fruit and Pomelo to List B in a single statement
        listB.addAll(Arrays.asList("Passion Fruit", "Pomelo"));
        System.out.println(listB);
//Print out the 3rd element from List A
        System.out.println(listA.get(2));
    }
}