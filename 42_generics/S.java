import java.util.ArrayList;

class S {
  
    public static void main (String[] args) {
         
          
        ArrayList list = new ArrayList ();

         list.add("om");
         list.add(true);
         list.add(15.29);

    
         pro(list); 
                      
    }
        
         
     static void pro(ArrayList <Integer> x ) {

         System.out.println(x);

         x.add(15);
         x.add(29);
         x.add(11);
        // x.add("15");

         System.out.println(x);
     }
}