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

  public static String replaceSubstring (String toUpdate, CharSequence remove, CharSequence insert) {
    String replaced = toUpdate.replace(remove, insert);

    return replaced;
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

//update mistranslated characters
          split[i] = replaceSubstring (split[i], "&#8217;", "'");
          split[i] = replaceSubstring (split[i], "â€“", "-");
          split[i] = replaceSubstring (split[i], "â€™", "'");
          split[i] = replaceSubstring (split[i], "\\\"", "\"");
          split[i] = replaceSubstring (split[i], "&#8220;", "\"");
          split[i] = replaceSubstring (split[i], "&#8221;", "\"");
          split[i] = replaceSubstring (split[i], "\\\'", "'");
          //this one will convert browser newlines to markdown newlines
          split[i] = replaceSubstring (split[i], "\\r\\n", "  ");
          //convert <p> tags to markdown H6
          split[i] = replaceSubstring (split[i], "<p>", "######");
          //remove unnecessary </p> tags
          split[i] = replaceSubstring (split[i], "</p>", "");
          //update <em> and </em> tags to markdown bold
          split[i] = replaceSubstring (split[i], "<em>", "**");
          split[i] = replaceSubstring (split[i], "</em>", "**");

          System.out.println(split[i]);

          //writing cleaned contents out to markdown goes here
        }

      }

      rawBlogContents.close();
    }
    catch (FileNotFoundException fileExcep) {
      System.out.println("File not found: " + args[0]);
    }
  }
}
