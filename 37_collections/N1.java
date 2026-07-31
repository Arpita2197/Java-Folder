import java.util.ArrayList;

class N1 {

    public static void main(String[] args) {

         ArrayList x = new ArrayList();        // x ma obj ref var ha

         x.add("mohan");
         x.add("sohan");
         x.add("tohan");
         x.add("rohan"); 
         x.add("gohan");

          System.out.println(x);

          System.out.println("~~~~~~~~");

           for(Object a : x) {          
            
            System.out.println(a);
       
           }

            
          }
    
}