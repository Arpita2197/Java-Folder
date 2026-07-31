import java.util.ArrayList;

class O {

    public static void main(String[] args) {

         ArrayList <Integer> x = new ArrayList <Integer>();

          x.add(23);
          x.add("arpita");
          x.add(true);
          x.add(23.56);

          System.out.println(x);
    }


}

//  O.java:10: error: incompatible types: String cannot be converted to Integer
//           x.add("arpita");
//                 ^
// O.java:11: error: incompatible types: boolean cannot be converted to Integer
//           x.add(true);
//                 ^
// O.java:12: error: incompatible types: double cannot be converted to Integer
//           x.add(23.56);
//                 ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 3 errors