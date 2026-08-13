import java.util.ArrayList;

class B {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        a.add(23);
        a.add(24);

         ArrayList<Float> b = new ArrayList<>();

        b.add(23.55f);
        b.add(24.99f);
        
         pro(a);
         pro(b);


    }


    static void pro(ArrayList< ? extends Number> x) {

         System.out.println(x.remove(0));    // remove kar sakta hai
 
        // System.out.println(x.add(25));        // add nhe kar payanga
        //  System.out.println(x.add(33.33f));         
//          B.java:28: error: incompatible types: int cannot be converted to CAP#1
//         System.out.println(x.add(25));
//                                  ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Number from capture of ? extends Number
// B.java:29: error: incompatible types: float cannot be converted to CAP#1
//          System.out.println(x.add(33.33f));
//                                   ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Number from capture of ? extends Number
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 2 errors
    }       
}