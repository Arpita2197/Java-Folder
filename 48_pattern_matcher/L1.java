import java.util.regex.Pattern;
import java.util.regex.Matcher;

class L1 {

    public static void main (String[] args) {

         Pattern p = Pattern.compile("aa");
         Matcher m = p.matcher("abaabaaabaaaab");

          while(m.find()) {

             System.out.println(m.start() + "- " + m.end() + " - " + m.group());

          }
    }

}   
