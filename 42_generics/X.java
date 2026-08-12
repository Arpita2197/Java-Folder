import java.util.ArrayList;

class X {

    public static void main(String[] args) {
      
         // Not ok...
        // ArrayList <Number> x = new ArrayList <Integer> ();
 
        ArrayList < ? extends Number> a = new ArrayList <Byte> ();       // ok
        ArrayList < ? extends Number> b = new ArrayList <Short> ();      // ok
        ArrayList < ? extends Number> c = new ArrayList <Integer>();     // ok
        ArrayList < ? extends Number> d = new ArrayList <Long> ();       // ok
        ArrayList < ? extends Number> e = new ArrayList <Float> ();      // ok
        ArrayList < ? extends Number> f = new ArrayList <Double> ();    // ok
        ArrayList < ? extends Number> g = new ArrayList <Number> ();    // ok

    }
}