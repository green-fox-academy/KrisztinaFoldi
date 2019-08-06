import com.sun.org.apache.xpath.internal.functions.Function;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise1 {
  public static void main(String[] args) {
    //Write a Stream Expression to get the even numbers from the following list:
    List<Integer> numbers1 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    numbers1.stream()
            .filter(number -> number % 2 == 0)
            .forEach(System.out::println);
    System.out.println("----");

    //Write a Stream Expression to get the squared value of the positive numbers from the following list
    List<Integer> numbers2 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    numbers2.stream()
            .filter(number -> number > 0)
            .map(number -> number *= number)
            .forEach(System.out::println);
    System.out.println("-----");

    // Write a Stream Expression to find which number squared value is more then 20 from the following list:
    List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
    numbers3.stream()
            .map(number -> number *= number)
            .filter(number -> number > 20)
            .forEach(System.out::println);
    System.out.println("-----");

    //Write a Stream Expression to get the average value of the odd numbers from the following list:
    List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    double doubleNumber = numbers4.stream()
            .filter(number -> number % 2 != 0)
            .mapToDouble(number -> number)
            .average()
            .getAsDouble();
    System.out.println(doubleNumber);
    System.out.println("---");

    // Write a Stream Expression to get the sum of the odd numbers in the following list:
    List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    int sum = numbers5.stream()
            .filter(number -> number % 2 != 0)
            .mapToInt(number -> number).sum();
    System.out.println(sum);
    System.out.println("----");


    // Write a Stream Expression to find the uppercase characters in a string!
    String strings6 = ("helloBELLO");
    String[] characters = strings6.split("");
    Arrays.stream(characters)
            .filter(x -> Character.isUpperCase(x.charAt(0)))
            .forEach(System.out::println);
    System.out.println("----");


    //  Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
    cities.stream()
            .filter(x -> x.startsWith("A"))
            .forEach(System.out::println);
    System.out.println("-----");


    //Write a Stream Expression to concatenate a Character list to a string!
    List<Character> characters8 = Arrays.asList( 'h', 'e', 'l', 'l', 'o');
    String newString = characters8.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
    System.out.println(newString);
    System.out.println("-----");

    //Write a Stream Expression to find the frequency of characters in a given string!
    String findTheFrequencyOfThisString = "almafa";
    String[] characters9 = findTheFrequencyOfThisString.split("");
   Map<String, Long> newHashMap = Arrays.stream(characters9)
           .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
    System.out.println(newHashMap);
  }
}