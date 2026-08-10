import java.util.ArrayList;

class D {

    public static void main(String[] args) {

        ArrayList x = new ArrayList  ();

        x.add(23);
        x.add(15);
        x.add(29);
        x.add(30);

        System.out.println(x);

        Integer y = x.get(0);

       
    }

}

//  D.java:16: error: incompatible types: Object cannot be converted to Integer
//         Integer y = x.get(0);
//                          ^
// Note: D.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error

