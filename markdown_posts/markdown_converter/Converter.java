import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Converter {

  static final int NUM_IN_ENTRY = 4;
  static final int NUM_TO_PROCESS = 982;

  public static void removeBeginning (int index, String[] split, char drop) {
    int length = split[index].length();
//remove beginning paren
    if (split[index] != null && length > 0 && split[index].charAt(0) == drop) {
      split[index] = split[index].substring(1, length);
    }

  }

  public static String removeSingleBeginning (String toUpdate, char drop) {
    int length = toUpdate.length();
    if (toUpdate != null && length > 0 && toUpdate.charAt(0) == drop) {
      return toUpdate.substring(1, length);
    }
    return toUpdate;
  }

  public static void removeEnding (int index, String[] split, char drop) {
    int length = split[index].length();
    if (split[index] != null && length > 0 &&
          split[index].charAt(length-1) == drop) {
      split[index] = split[index].substring(0, length-1);
    }

  }

  public static String removeSingleEnding (String toUpdate, char drop) {
    int length = toUpdate.length();
    if (toUpdate != null && length > 0 && toUpdate.charAt(length-1) == drop) {
      return toUpdate.substring(0, length-1);
    }
    return toUpdate;
  }

  public static String replaceSubstring (String toUpdate, CharSequence remove, CharSequence insert) {
    String replaced = toUpdate.replace(remove, insert);

    return replaced;
  }

  public static void main(String[] args) throws IOException {
    String read = null;
    String[] entirePost = new String[NUM_TO_PROCESS];
    String[] split = new String[NUM_IN_ENTRY];
    try {
      BufferedReader rawBlogContents = new BufferedReader(
                                        new FileReader(args[0]));

      while ((read = rawBlogContents.readLine()) != null) {
        entirePost = read.split("\\),\\(");

        //iterate through all posts and process each one into markdown
        for (int n = 0; n < entirePost.length; ++n) {

          split = entirePost[n].split(",'");

          //cleanup of individual post content as needed for proper rendering
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
            split[i] = replaceSubstring (split[i], "\\r\\n", "<br>");

          //split[i] = replaceSubstring (split[i], "<p>", "");
          //split[i] = replaceSubstring (split[i], "</p>", "");

          //update <em> and </em> tags to markdown italics
          split[i] = replaceSubstring (split[i], "<em>", "*");
          split[i] = replaceSubstring (split[i], "</em>", "*");

          //update deprecated <acronym> to <abbr>
          split[i] = replaceSubstring (split[i], "<acronym", "<abbr");
          split[i] = replaceSubstring (split[i], "</acronym>", "</abbr>");

          //handles special post title cases
          if (i == 1) {
            if ((split[i].charAt(0) == '\"') &&
             (split[i].charAt((split[i].length()-1)) == '\"')) {
               split[i] = removeSingleBeginning(split[i], '\"');
               split[i] = removeSingleEnding(split[i], '\"');
            }

            split[i] = replaceSubstring (split[i], "<q>", "");
            split[i] = replaceSubstring (split[i], "</q>", "");
            split[i] = replaceSubstring (split[i], "/", "-");
            split[i] = replaceSubstring (split[i], "\"", "'");
          }

          //handles special case when post title is wrapped in <q> tags


            System.out.println(split[i]);
          }


      //finagle things for post frontmatter header
          String dateTime = replaceSubstring (split[3], "-", "/");
          String path = "/" + replaceSubstring (split[1], " ", "");
          String postYear = (dateTime.split("/"))[0];

      //writing contents out to markdown goes here

          FileWriter writeOut = new FileWriter("../../gatsby_files/" +
          "typewriting_posts/src/pages/converted_posts/" + postYear + path + ".md");
      //create post header per file
          writeOut.write("---" + "\n");
          writeOut.write("path: \"" +  "/" + dateTime.split(" ")[0] + path + "\" \n");
          writeOut.write("date: \"" + dateTime + "\" \n");
          writeOut.write("title: \"" + split[1] + "\" \n");
          writeOut.write("---" + "\n");

      //write out processed blog post body
          writeOut.write(split[2]);
          writeOut.flush();
          writeOut.close();
        }
      }

      rawBlogContents.close();
    }
    catch (FileNotFoundException fileExcep) {
      System.out.println("File not found: " + args[0]);
    }
  }
}
