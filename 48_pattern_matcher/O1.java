                
  import java.util.regex.Pattern;
  import java.util.regex.Matcher;

  class O1 {

     public static void main(String[] args) {

         Pattern p = Pattern.compile("\\w");                  // \w = [a-zA-Z_0-9]           
         Matcher m = p.matcher("9>?_2W u#d");

          while(m.find()) {

             System.out.println(m.start() + " - " + m.end() + " - " + m.group());

          }
     }
  }   