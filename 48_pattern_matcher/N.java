                
  import java.util.regex.Pattern;
  import java.util.regex.Matcher;

  class N {

     public static void main(String[] args) {

        // Pattern p = Pattern.compile("\\d\\d");
         Pattern p = Pattern.compile("[0-9][0-9]");                           
         Matcher m = p.matcher("om is in class 101th and he is 15 years old");

          while(m.find()) {

             System.out.println(m.start() + " - " + m.end() + " - " + m.group());

          }
     }
  }       
