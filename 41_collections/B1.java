import java.util.TreeSet;

class B1 {

    public static void main(String[] args) {

         TreeSet <String> x = new TreeSet <String> ();

        x.add("sarvan");
        x.add("gitesh");
        x.add("manoj");
        x.add("vikas");
        x.add("bijendra");
        x.add("deepak");

        System.out.println(x);

         String [] ar = new String[0];
         
         String[] arr = x.toArray(ar);
      
        System.out.println(ar == arr);

        for(String next : arr) {

              System.out.println(next + "~");
        }
    }
}