import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main (String[] args) {
    writeMultipleLines("src/index.txt", "cica", 8);

  }
  public static void writeMultipleLines(String path, String word, int number) {
    List<String> wordsInTheFile = createList(word, number);
    writeToFile(path, wordsInTheFile);
  }

  public static List<String> createList (String word, int number) {
    List<String> wordsInTheFile = new ArrayList<>();
    for (int i = 0; i < number; i++) {
      wordsInTheFile.add(word);
    }
    return wordsInTheFile;
  }

  public static void writeToFile (String path, List<String> wordsInTheFile) {
    try {
      Path filePath = Paths.get(path);
      Files.write(filePath, wordsInTheFile);
    } catch (IOException e) {
    }
    }
  }


// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.
