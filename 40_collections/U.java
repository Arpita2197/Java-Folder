import java.util.Arrays;

class U {

     public static void main (String[] args) {

         String[] x =  {"t", "Z", " s", " M", "8", " j", "Y", " 3"};

           for (String next : x) {

             System.out.println(next);

           }

           Arrays.sort(x);

           System.out.println("~~~~~~~~~~~~~~~~");

            for (String next : x) {

             System.out.print(next + " ");


           }
     }
}