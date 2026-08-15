import java.util.regex.Pattern;
import java.util.regex.Matcher;

class D {

    public static void main(String[] args) {

         Pattern p = Pattern.compile("mohan");
         Matcher m = p.matcher("student mohan is in class 10th");

          System.out.println(m);

          m.find();

          System.out.println(m);

    }

}    
