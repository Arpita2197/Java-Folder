import java.util.TreeSet;

class Z {

    public static void main(String[] args) {

         TreeSet <Integer> x = new TreeSet <Integer> ();

         x.add(56);
        x.add(13);
        x.add(87);
        x.add(9);
        x.add(23);

        System.out.println(x);

        Object [] arr = x.toArray();

        for(Object next : x) {

              System.out.println(next);
        }
    }
}