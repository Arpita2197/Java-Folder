import java.util.TreeSet;

class A2 {

    public static void main(String[] args) {

         TreeSet <String> x = new TreeSet <String> ();

        x.add("sarvan");
        x.add("gitesh");
        x.add("manoj");
        x.add("vikas");
        x.add("bijendra");
        x.add("deepak");

        System.out.println(x);

        Object [] arr = x.toArray();

        for(Object next : x) {
              
               String y = (String)next;
              System.out.println(next + "~" + y.length());
        }
    }
}