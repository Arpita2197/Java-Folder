import java.util.PriorityQueue;
import java.util.ArrayList;

class H {

     public static void main (String[] args) {

         PriorityQueue <Integer> queue = new PriorityQueue <Integer> ();

         queue.offer(88);        
         queue.offer(11);        
         queue.offer(56);        
         queue.offer(65);   
         queue.offer(100);   
         queue.offer(45); 
         queue.offer(99);

          ArrayList <Integer> List = new ArrayList <Integer> (queue);

          System.out.println(queue);
          System.out.println(List);

                 System.out.println("---------------");
          
         System.out.println(queue.poll());         
         System.out.println(queue.poll()); 
         System.out.println(queue.poll());         
         System.out.println(queue.poll());  
         System.out.println(queue.poll());   
         System.out.println(queue.poll()); 
         System.out.println(queue.poll());

               System.out.println("~~~~~~~~~~~~~~~~~");

            System.out.println(queue);
          System.out.println(List);

     }
}