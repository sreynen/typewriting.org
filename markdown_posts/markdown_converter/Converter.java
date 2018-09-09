import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Converter {
  public static void main(String[] args) throws IOException {
    String read = null;
    try {
      BufferedReader rawBlogContents = new BufferedReader(
                                        new FileReader(args[0]));

      while ((read = rawBlogContents.readLine()) != null) {
        String[] split = read.split(",'");

        for (int i = 0; i < split.length; ++i) {
          System.out.println(split[i]);
        }

      }

      rawBlogContents.close();
    }
    catch (FileNotFoundException fileExcep) {
      System.out.println("File not found: " + args[0]);
    }
  }
}
