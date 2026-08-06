import java.util.HashMap;
import java.util.Set;

class P {

     public static void main (String[] args) {

         HashMap <String,Double> map = new HashMap <String,Double> ();

        map.put("mihan",88.50);
         map.put("rohit",80.50);
         map.put("anand",54.40);
         map.put("raj",13.11);
         map.put("sonam",78.80);      
         map.put("nandita",45.50);

         System.out.println(map);

         for(Object next : map) {

             //-------
         }
     }
}

//  P.java:19: error: for-each not applicable to expression type
//          for(Object next : map) {
//                            ^
//   required: array or java.lang.Iterable
//   found:    HashMap<String,Double>
// 1 error
