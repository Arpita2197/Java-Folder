import java.util.HashMap;

class N {

     public static void main(String[] args) {

         HashMap <String,Double> x = new HashMap <String,Double> ();

         x.put("mihan",88.50);
         x.put("rohit",80.50);
         x.put("anand",54.40);
         x.put("raj",13.11);
         x.put("sonam",78.80);      
         x.put("nandita",45.50);

          //String str = new String("sonam");         // o/p == 78.80
          String str = new String("geetika");         // null

           System.out.println(x.get(str));
     }
}