                
  import java.util.regex.Pattern;
  import java.util.regex.Matcher;

  class M1 {

     public static void main(String[] args) {

         Pattern p = Pattern.compile("\\d");                 
         Matcher m = p.matcher("om is in class 10th and he is 15 years old");

          while(m.find()) {

             System.out.println(m.start() + " - " + m.end() + " - " + m.group());

          }
     }
  }       
