                
  import java.util.regex.Pattern;
  import java.util.regex.Matcher;

  class S2 {

     public static void main(String[] args) {

     
         Pattern p = Pattern.compile("[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");           
         Matcher m = p.matcher("my number is 1266435432 and your number is 7898933683 and someone's number is 877098795");

          while(m.find()) {

             System.out.println(m.start() + " - " + m.end() + " - " + m.group());

          }
     }
  }  