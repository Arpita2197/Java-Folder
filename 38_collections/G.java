import java.util.HashSet;

class G {


     public static void main(String[] args) {

         HashSet <String> x = new HashSet<String> ();
        
          x.add("kamal");
          x.add("mukesh");
          x.add("raju");
          x.add("sonu");

          System.out.println(x); 

           //String y = new String("raju");  

           String y = new String("geet");  

            System.out.println(x.contains(y)); 

               System.out.println(x);  
         
                                      
          
     }
}