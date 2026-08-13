import java.util.ArrayList;
import java.util.HashSet;
import java.util.Date;
import java.util.TreeMap;

class A4 {

    public static void main(String[] args) {

        ArrayList <HashSet<TreeMap>> x = new ArrayList<HashSet<TreeMap>> ();
        
         // errors;
         
        // x.add(23.5);
        // x.add(15);
        // x.add(true);
        // x.add("om");
        // x.add(new HashSet<Integer>());
        // x.add(new HashSet<String>());
        // x.add(new HashSet<Date>());


         x.add(new HashSet<TreeMap>());
        x.add(new HashSet<TreeMap>());
        x.add(new HashSet<TreeMap>());


        System.out.println(x);

    }
}