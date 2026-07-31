import java.util.ArrayList;

class N2 {

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
            
            System.out.println(a.length());
       
           }

            
          }
    
}

//  N2.java:21: error: cannot find symbol
//             System.out.println(a.length());
//                                 ^
//   symbol:   method length()
//   location: variable a of type Object
// Note: N2.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
