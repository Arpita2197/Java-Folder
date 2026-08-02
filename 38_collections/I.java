import java.util.HashSet;
import java.util.Iterator;

 class I {

      public static void main(String[] args) {

           HashSet <String> x = new HashSet <String> ();

           x.add("mukesh");
           x.add("raju");
           x.add("ram");
           x.add("shyam");
           x.add("golu");

           System.out.println(x);

           Iterator <String> y = x.iterator();

           while (y.hashNext()) {

                System.out.println(y.Next());
           }
      }
 }
