import java.util.ArrayList;

class T {

     public static void main(String[] args) {

         ArrayList <Integer> x = new ArrayList <Integer> ();

         x.add(0);
         x.add(1);
         x.add(2);
         x.add(5);
         x.add(8);

          System.out.println(x);
                // remove() ka 2 mathod ha 1) (int index) , 2) (object)

                 // remove(2) value dali jo primitive ha aur uska int version ha remove ka isliya usna index samjha
           x.remove(2); 

            System.out.println(x);

            
     }
}