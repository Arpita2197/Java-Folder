import java.util.ArrayList;

class M2 {

    public static void main(String[] args) {

         ArrayList x = new ArrayList();

         x.add("mohan");
         x.add("sohan");
         x.add("tohan");
         x.add("rohan"); 
         x.add("gohan");

          System.out.println(x);

          System.out.println("~~~~~~~~");

          for(int i = 0 ; i<x.size() ; i++) {

             String a = (String)x.get(i);
        
           System.out.println( a + "~~" + a.length());

          }
    }
}