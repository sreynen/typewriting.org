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
          int length = split[i].length();
//remove beginning paren
          if (split[i] != null && length > 0 && split[i].charAt(0) == '(') {
            split[i] = split[i].substring(1, length);
          }

//remove ending semicolon
          length = split[i].length();
          if (split[i] != null && length > 0 &&
                split[i].charAt(length-1) == ';') {
            split[i] = split[i].substring(0, length-1);
          }


//remove ending paren
          length = split[i].length();
          if (split[i] != null && length > 0 &&
                split[i].charAt(length-1) == ')') {
            split[i] = split[i].substring(0, length-1);
          }

//remove trailing apostrophes
          length = split[i].length();
          if (split[i] != null && length > 0 &&
                split[i].charAt(length-1) == '\'') {
            split[i] = split[i].substring(0, length-1);
          }


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
