import java.util.ArrayList;
import java.util.Iterator;

class L2 {

    public static void main(String[] args)  {

         ArrayList <String> x = new ArrayList <String> ();

         x.add("mohan");
         x.add("dinesh");
         x.add("vidit");
         x.add("sarvesh");
         x.add("prayag");


         System.out.println(x);

         System.out.println("~~~~~~~~~~~~~~");

         Iterator <String> y = x.iterator();

          while(y.hasNext()) {           

            System.out.println(y.next().length());       // next() ko pata ha ki typesafety use ki gai ha aur typesafety ka andar String ha aur String ka andar length() property hoti ha
            
          }
    }
}