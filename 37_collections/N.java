import java.util.ArrayList;

class N {

    public static void main(String[] args) {

         ArrayList x = new ArrayList();        // x ma obj ref var ha

         x.add("mohan");
         x.add("sohan");
         x.add("tohan");
         x.add("rohan"); 
         x.add("gohan");

          System.out.println(x);

          System.out.println("~~~~~~~~");

           for(String a : x ) {          // : ka right ma iterable(Collections) aur array bss aa sakta ha

            System.out.println(a);
       
           }

            
          }
    
}

//  N.java:19: error: incompatible types: Object cannot be converted to String
//            for(String a : x) {        
// Note: N.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error