import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Converter {

  public static void removeBeginning (int index, String[] split, char drop) {
    int length = split[index].length();
//remove beginning paren
    if (split[index] != null && length > 0 && split[index].charAt(0) == drop) {
      split[index] = split[index].substring(1, length);
    }

  }

  public static void removeEnding (int index, String[] split, char drop) {
    int length = split[index].length();
    if (split[index] != null && length > 0 &&
          split[index].charAt(length-1) == drop) {
      split[index] = split[index].substring(0, length-1);
    }

  }

  public static void main(String[] args) throws IOException {
    String read = null;
    try {
      BufferedReader rawBlogContents = new BufferedReader(
                                        new FileReader(args[0]));

      while ((read = rawBlogContents.readLine()) != null) {
        String[] split = read.split(",'");

        for (int i = 0; i < split.length; ++i) {

//remove beginning paren
          removeBeginning (i, split, '(');

//remove ending semicolon
          removeEnding (i, split, ';');

//remove ending paren
          removeEnding (i, split, ')');

//remove trailing apostrophes
          removeEnding (i, split, '\'');


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
