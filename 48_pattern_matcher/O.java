                
  import java.util.regex.Pattern;
  import java.util.regex.Matcher;

  class O {

     public static void main(String[] args) {

         Pattern p = Pattern.compile("\\w");                  // \w = [a-zA-Z_0-9]           
         Matcher m = p.matcher("%@t_2 K7$<0");

          while(m.find()) {

             System.out.println(m.start() + " - " + m.end() + " - " + m.group());

          }
     }
  }     