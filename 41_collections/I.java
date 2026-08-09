import java.util.TreeSet;
import java.util.SortedSet;

class I {

    public static void main(String[] args) {

         TreeSet <String> x = new TreeSet <String> ();

         
        x.add("sarvan");
        x.add("gitesh");
        x.add("manoj");
        x.add("vikas");
        x.add("bijendra");
        x.add("deepak");

         System.out.println(x);

           System.out.println(x.last());      	// last() ==>  Returns the last (highest) element currently in this set.

    }
}