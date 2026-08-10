
                       // GENERICS......>>>>>>>>>>>>

import java.util.ArrayList;

class B1 {

    public static void main(String[] args) {

        ArrayList <Integer> x = new ArrayList <Integer> ();

        x.add(23);
        x.add(true);
        x.add("om");
        x.add(15.29);

        System.out.println(x);

       
    }

}

// C.java:10: error: incompatible types: boolean cannot be converted to Integer
//         x.add(true);
//               ^
// C.java:11: error: incompatible types: String cannot be converted to Integer
//         x.add("om");
//               ^
// C.java:12: error: incompatible types: double cannot be converted to Integer
//         x.add(15.29);
//               ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 3 errors
