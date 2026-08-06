import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;


class P1 {

     public static void main (String[] args) {

         HashMap <String,Double> map = new HashMap <String,Double> ();

        map.put("mihan",88.50);
         map.put("rohit",80.50);
         map.put("anand",54.40);
         map.put("raj",13.11);
         map.put("sonam",78.80);      
         map.put("nandita",45.50);

         System.out.println(map);

          Set <Map.Entry<String,Double>> set = map.entrySet();

          for(Map.Entry next : set) {

             System.out.println(next.getKey() + "----" + next.getValue());
          }
     }
}