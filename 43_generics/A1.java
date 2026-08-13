import java.util.ArrayList;
import java.util.HashSet;

class A1 {

    public static void main(String[] args) {

        ArrayList <HashSet> x = new ArrayList<> ();
        
         // errors;
         
        // x.add(23.5);
        // x.add(15);
        // x.add(true);
        // x.add("om");

        x.add(new HashSet());
        x.add(new HashSet());
        x.add(new HashSet());


        System.out.println(x);

    }
}