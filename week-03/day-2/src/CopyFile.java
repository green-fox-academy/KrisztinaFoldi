import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {
  public static void main(String[] args) {
    fileCopier("index.txt", "index2.txt");
  }
  public static void fileCopier(String fileName1, String fileName2) {
    try {
    Path indexFilePath = Paths.get("src/", fileName1);
    Path index2FilePath = Paths.get("src/", fileName2);
    Files.copy(indexFilePath, index2FilePath, StandardCopyOption.REPLACE_EXISTING);
    }catch (IOException e) {
    }
    }
}
// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
