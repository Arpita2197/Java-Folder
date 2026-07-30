import java.util.ArrayList;
import java.util.Iterator;

class L1 {

    public static void main(String[] args)  {

         ArrayList x = new ArrayList();

         x.add("mohan");
         x.add("dinesh");
         x.add("vidit");
         x.add("sarvesh");
         x.add("prayag");


         System.out.println(x);

         System.out.println("~~~~~~~~~~~~~~");

         Iterator y = x.iterator();

          while(y.hasNext()) {           

            System.out.println(y.next().length());       // next() obj return karta ha aur obj ma length() property nhe hoti ha
            
          }
    }
}

//  L1.java:25: error: cannot find symbol
//             System.out.println(y.next().length());       
//                                        ^
//   symbol:   method length()
//   location: class Object
// Note: L1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error