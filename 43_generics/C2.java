import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;


class C2 {

    public static void main(String[] args) {

       HashSet< ? extends List> x1 = new HashSet<ArrayList>();
       HashSet< ? extends List> x2 = new HashSet<Vector>();
       HashSet< ? extends List> x3 = new HashSet<LinkedList>();

    
    }
}