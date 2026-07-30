// heterogenous records are allowed

import java.util.ArrayList;

class F {

     public static void main(String[] args) {

         ArrayList x = new ArrayList();

          x.add(10);
          x.add(true);
          x.add("mohan");
          x.add(23.56);
          x.add('A');

          System.out.println(x);
     }
}