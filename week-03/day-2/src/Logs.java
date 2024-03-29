import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Logs {
  public static void main (String[] args) {
    try {
      Path logFilePath = Paths.get("src/log.txt");
      List<String> contentOfLog = Files.readAllLines(logFilePath);
      System.out.println(contentOfLog);
    } catch (IOException e) {

    }
  }
}
// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
