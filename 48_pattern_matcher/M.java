                
                // REGEX..............

  import java.util.regex.Pattern;
  import java.util.regex.Matcher;

  class M {

     public static void main(String[] args) {

         Pattern p = Pattern.compile("\d");                    // \d = A digit [0-9]
         Matcher m = p.matcher("om is in class 10th and he is 15 years old");

          while(m.find()) {

             System.out.println(m.start() + " - " + m.end() + " - " + m.group());

          }
     }
  }       




//     M.java:11: error: illegal escape character
//          Pattern p = Pattern.compile("\d");                    // \d = A digit [0-9]
//                                        ^
// 1 error
       