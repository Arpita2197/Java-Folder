import java.util.HashMap;
import java.util.Set;

class O {

     public static void main (String[] args) {

         HashMap <String,Double> x = new HashMap <String,Double> ();

        x.put("mihan",88.50);
         x.put("rohit",80.50);
         x.put("anand",54.40);
         x.put("raj",13.11);
         x.put("sonam",78.80);      
         x.put("nandita",45.50);

         System.out.println(x);

         Set <String> y = x.keySet();

         for(String nextKey : y) {

             System.out.println(nextKey + "----" + x.get(nextKey));           // get () ==> value dega
         }
     }
}