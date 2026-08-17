import java.util.regex.Pattern;
import java.util.regex.Matcher;

class E {

     public static void main(String[] args) {

         Pattern p = Pattern.compile("\\d\\d");

         Matcher m = p.matcher("3256 is my score");
        // Matcher m = p.matcher("0056 is my score");
        // Matcher m = p.matcher("4 is my score");
       // Matcher m = p.matcher("a11 is my score");

         System.out.println(m.lookingAt());    //Attempts to match the input sequence, starting at the beginning of the region, against the pattern.
      
     }
}