import java.util.TreeSet;
import java.util.SortedSet;

class K {

    public static void main(String[] args) {

         TreeSet <String> x = new TreeSet <String> ();

         
        x.add("sarvan");
        x.add("gitesh");
        x.add("manoj");
        x.add("vikas");
        x.add("bijendra");
        x.add("deepak");

         System.out.println(x);

        // System.out.println(x.tailSet("manoj"));      	// tailSet() ==> Returns a view of the portion of this set whose elements are greater than or equal to fromElement.
  
          System.out.println(x.tailSet("ekta")); 
    }
}