public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        int allSeconds = 24 * (int) Math.pow(60,2);
        System.out.println(allSeconds);

        int currentTime = (currentHours * (int) Math.pow(60, 2) ) + (currentMinutes * 60) + currentSeconds;
        System.out.println(currentTime);


        System.out.println("Remaining seconds: " + (allSeconds - currentTime));
    }
}
