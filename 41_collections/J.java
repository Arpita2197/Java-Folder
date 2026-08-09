import java.util.TreeSet;
import java.util.SortedSet;

class J {

    public static void main(String[] args) {

         TreeSet <String> x = new TreeSet <String> ();

         
        x.add("sarvan");
        x.add("gitesh");
        x.add("manoj");
        x.add("vikas");
        x.add("bijendra");
        x.add("deepak");

         System.out.println(x);

        // System.out.println(x.headSet("manoj"));      	// headSet() ==> Returns a view of the portion of this set whose elements are strictly less than toElement.
  
           System.out.println(x.headSet("ekta")); 
    }
}