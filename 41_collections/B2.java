import java.util.TreeSet;

class B2 {

    public static void main(String[] args) {

         TreeSet x = new TreeSet  ();

        x.add("sarvan");
        x.add("gitesh");
        x.add("manoj");
        x.add("vikas");
        x.add("bijendra");
        x.add("deepak");

        System.out.println(x);

         String [] ar = new String[0];
         
         String[] arr = x.toArray(ar);

        for(String next : arr) {

              System.out.println(next.length() + "~" + next);
        }
    }
}

//  B2.java:20: error: incompatible types: Object[] cannot be converted to String[]
//          String[] arr = x.toArray(ar);
//                                  ^
// Note: B2.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
