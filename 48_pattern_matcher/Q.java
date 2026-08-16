                
  import java.util.regex.Pattern;
  import java.util.regex.Matcher;

  class Q {

     public static void main(String[] args) {

     
         Pattern p = Pattern.compile("[^pqr]");           //[abc] == a,b or c               
         Matcher m = p.matcher("cyegrtRbdPaTrRQqbp");

          while(m.find()) {

             System.out.println(m.start() + " - " + m.end() + " - " + m.group());

          }
     }
  }  