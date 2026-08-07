import java.util.Collections;
import java.util.ArrayList;

class L1 {

    public static void main(String[] args) {

         ArrayList <String> x = new ArrayList <String> ();

         x.add("mohan");       
         x.add("zakir");
         x.add("farahan");
         x.add("motu");     
         x.add("bablu");

          System.out.println(x);

          Collections.sort(x);
          
          System.out.println(x);
          
    }
}