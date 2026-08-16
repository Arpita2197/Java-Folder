                
  import java.util.regex.Pattern;
  import java.util.regex.Matcher;

  class Y {

     public static void main(String[] args) {

     
         Pattern p = Pattern.compile("a.b");           
         Matcher m = p.matcher("na b_ja#b 98a,byaEb ");

          while(m.find()) {

             System.out.println(m.start() + " - " + m.end() + " - " + m.group());

          }
     }
  }  