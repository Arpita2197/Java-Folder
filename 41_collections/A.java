import java.util.TreeSet;

class A {

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

              System.out.println(next + "~");
        }
    }
}