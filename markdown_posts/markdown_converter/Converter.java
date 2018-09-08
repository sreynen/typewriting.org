import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Converter {
  public static void main(String[] args) throws IOException {

    try {
      FileWriter blogFile = new FileWriter(args[0]);

      System.out.print(blogFile);

      blogFile.close();
    }
    catch (FileNotFoundException fileExcep) {
      System.out.println("File not found: " + args[0]);
    }
  }
}
