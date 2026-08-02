import java.util.LinkedList;

class B {

    public static void main (String[] args) {
      
         // AS a Queue
        LinkedList <String> x = new LinkedList <String> ();

         x.offer("mohan");          // value add ho rhe ha
         x.offer("sohan");
         x.offer("rohan");
         x.offer("gohan");
         x.offer("tohan"); 
      

          System.out.println(x);

               System.out.println("~~~~~~~~~~~");

          System.out.println(x.peek());          // retrives the first element 
          System.out.println(x.peek());
          System.out.println(x.peek());
          System.out.println(x.peek());
          System.out.println(x.peek());      

    
           
          System.out.println("~~~~~~~~~~~");

          System.out.println(x.poll());          // remove ho raha ha
          System.out.println(x.poll());
          System.out.println(x.poll());
          System.out.println(x.poll());
          System.out.println(x.poll());      

        
         
          System.out.println(x);

 

    }
}