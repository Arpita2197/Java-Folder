import java.util.Collections;
import java.util.ArrayList;

class L {

    public static void main(String[] args) {

         ArrayList <Integer> x = new ArrayList <Integer> ();

         x.add(88);       
         x.add(70);
         x.add(18);
         x.add(48);     
         x.add(78);

          System.out.println(x);

          Collections.sort(x);
          
          System.out.println(x);
          
    }
}