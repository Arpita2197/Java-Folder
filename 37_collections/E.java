// Duplicates records are allowed

import java.util.ArrayList;

class E {

     public static void main(String[] args) {

         ArrayList x = new ArrayList();

         x.add(23);
         x.add(20);
         x.add(23);
         x.add(15);
         x.add(10);
         x.add(200);
         x.add(23);

          System.out.println(x);
     }
}