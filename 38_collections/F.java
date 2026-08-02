import java.util.HashSet;

class F {


     public static void main(String[] args) {

         HashSet <String> x = new HashSet<String> ();
        
          x.add("kamal");
          x.add("mukesh");
          x.add("raju");
          x.add("sonu");

          System.out.println(x); 

           String y = new String("kamal");  

            System.out.println(x.remove(y)); 

               System.out.println(x);  
         
                                      
          
     }
}