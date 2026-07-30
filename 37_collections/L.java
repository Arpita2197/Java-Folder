import java.util.ArrayList;
import java.util.Iterator;

class L {

    public static void main(String[] args)  {

         ArrayList x = new ArrayList();

         x.add("mohan");
         x.add("dinesh");
         x.add("vidit");
         x.add("sarvesh");
         x.add("prayag");


         System.out.println(x);

         System.out.println("~~~~~~~~~~~~~~");

         Iterator  y = x.iterator();

          while(y.hasNext()) {             // y ma isliya call kar raha hasNext() ko kyuki hasNext() Iterator ka metod ha

            System.out.println(y.next());
            
          }
    }
}