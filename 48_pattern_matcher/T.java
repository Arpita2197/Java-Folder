                
  import java.util.regex.Pattern;
  import java.util.regex.Matcher;

  class T {

     public static void main(String[] args) {

                                           // X=[0-9]{n=9}
         Pattern p = Pattern.compile("[6-9][0-9]{9}");          // greedy quantifiers = X{n} ==>  X ,exactly n times           
         Matcher m = p.matcher("my number is 1266435432 and your number is 7898933683 and someone's number is 877098795");

          while(m.find()) {

             System.out.println(m.start() + " - " + m.end() + " - " + m.group());

          }
     }
  }  