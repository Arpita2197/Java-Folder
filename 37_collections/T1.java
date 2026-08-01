import java.util.ArrayList;

class T1 {

     public static void main(String[] args) {

         ArrayList <Integer> x = new ArrayList <Integer> ();

         x.add(0);
         x.add(1);
         x.add(3);
         x.add(2);
         x.add(8);

          System.out.println(x);
                // remove() ka 2 mathod ha 1) (int index) , 2) (object)

                 // remove(2) value dali jo primitive ha aur uska int version ha remove ka isliya usna index samjha
             
              Integer t = 2 ;    // Interger wrapper class ka obj bana toh remove(obj) wala call hua , toh matched value remove ho gai

            System.out.println(x.remove(t));

            System.out.println(x);

            
     }
}