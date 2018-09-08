import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Converter {
  public static void main(String[] args) throws IOException {
    int character = 0;
    try {
      FileReader rawBlogContents = new FileReader(args[0]);

      while ((character = rawBlogContents.read()) != -1) {
        System.out.print((char) character);
      }

      //System.out.print(rawBlogContents);

      rawBlogContents.close();
    }
    catch (FileNotFoundException fileExcep) {
      System.out.println("File not found: " + args[0]);
    }
  }
}
