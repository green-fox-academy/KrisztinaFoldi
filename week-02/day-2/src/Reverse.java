public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";


        int index = reversed.indexOf("fI");
        System.out.println(reversed.indexOf("fI"));

        char character = reversed.charAt(0);
        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.


           System.out.println(reverse(reversed));
    }

             public static String reverse(String word) {
                 String reversedString = "";
                 for (int i= word.length() -1  ; i >= 0; i--) {
                     reversedString += word.charAt(i);
                 }
                 return reversedString;
              }
}
