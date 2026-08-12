import java.util.ArrayList;

class Q {

    public static void main (String[] args) {
         
          // ALL OK 
        ArrayList a = new ArrayList();
        ArrayList <Integer> b = new ArrayList <Integer> ();
        ArrayList <Number> c = new ArrayList ();
        ArrayList d = new ArrayList <Double> ();
        ArrayList <Number> e = new ArrayList <> ();
         
         // Not ok

         ArrayList <Number> g = new ArrayList <Integer> ();
         
    }
}