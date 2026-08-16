                
  import java.util.regex.Pattern;
  import java.util.regex.Matcher;

  class R {

     public static void main(String[] args) {

     
         Pattern p = Pattern.compile("[d-mr-x]");           
         Matcher m = p.matcher("abcegfhimnstuwz");

          while(m.find()) {

             System.out.println(m.start() + " - " + m.end() + " - " + m.group());

          }
     }
  }  