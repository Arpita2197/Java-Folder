import java.util.Collections;
import java.util.ArrayList;

class O {

    public static void main(String[] args) {

         ArrayList <Integer> x = new ArrayList <Integer> ();

         x.add(88);       
         x.add(70);
         x.add(18);
         x.add(48);     
         x.add(78);

          System.out.println(x);
              
       //   int index =  Collections.binarySearch(x , 18);    
         int index =  Collections.binarySearch(x , 70);        // binarySearch hamesha sorted list or array ma hoga......
          
          System.out.println(index);
          
    }
}