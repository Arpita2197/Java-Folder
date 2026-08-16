                
  import java.util.regex.Pattern;
  import java.util.regex.Matcher;

  class P {

     public static void main(String[] args) {

     
         Pattern p = Pattern.compile("[abc]");           //[abc] == a,b or c               
         Matcher m = p.matcher("uxatw57sBgcxeCsfa");

          while(m.find()) {

             System.out.println(m.start() + " - " + m.end() + " - " + m.group());

          }
     }
  }   