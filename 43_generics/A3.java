import java.util.ArrayList;
import java.util.HashSet;
import java.util.Date;
import java.util.TreeMap;

class A1 {

    public static void main(String[] args) {

        ArrayList <HashSet<TreeMap>> x = new ArrayList<HashSet<TreeMap>> ();
        
         // errors;
         
        // x.add(23.5);
        // x.add(15);
        // x.add(true);
        // x.add("om");

        x.add(new HashSet<Integer>());
        x.add(new HashSet<String>());
        x.add(new HashSet<Date>());


        System.out.println(x);

    }
}

//  A3.java:19: error: incompatible types: HashSet<Integer> cannot be converted to HashSet<TreeMap>
//         x.add(new HashSet<Integer>());
//               ^
// A3.java:20: error: incompatible types: HashSet<String> cannot be converted to HashSet<TreeMap>
//         x.add(new HashSet<String>());
//               ^
// A3.java:21: error: incompatible types: HashSet<Date> cannot be converted to HashSet<TreeMap>
//         x.add(new HashSet<Date>());
//               ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 3 errors