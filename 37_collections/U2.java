import java.util.ArrayList;

class U2 {

     public static void main(String[] args) {

         ArrayList <String> x = new ArrayList <String> ();

          x.add("mohan");
          x.add("sohan");
          x.add("rohan");
          x.add("gohan");
          x.add("tohan"); 

           System.out.println(x);

           System.out.println("~~~~~~~~~");
   
             int size = x.size();  // 5
               // System.out.println(size);

            for(int i = 0 ; i<size ; i++) {       // size bhi reduce hoga

                 System.out.println(x.remove(0));            // dynamiccally ho raha ha sab
             }

              
           System.out.println(x);

     }
  }