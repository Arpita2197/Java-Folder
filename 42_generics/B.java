import java.util.ArrayList;

class B {

    public static void main(String[] args) {

        ArrayList x = new ArrayList();

        x.add(23);
        x.add(true);
        x.add("om");
        x.add(15.29);

        System.out.println(x);

       // System.out.println( x.get(2) );  // o/p ==> om 

       String str = x.get(2);

    }

}        // parent class object ko child class (string) ma store nhe kar sakta

//  B.java:16: error: incompatible types: Object cannot be converted to String
//        String str = x.get(2);
//                          ^
// Note: B.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
