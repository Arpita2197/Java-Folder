import java.util.PriorityQueue;
import java.util.Iterator;

class E {

     public static void main (String[] args) {

         PriorityQueue <String> x = new PriorityQueue <String> ();

         x.offer("mohan");        
         x.offer("gohan");        
         x.offer("ram");        
         x.offer("lara");   
         x.offer("golu");   
         x.offer("kajju"); 
         x.offer("Zebra ");
          
           Iterator <String>  y = x.iterator();

            // for( ; y.hasNext()  ;) {

            //      System.out.println(y.next());
            // }

            while(y.hasNext()) {

                   System.out.println(y.next());
            }
     }
}