import java.util.Arrays;

class T {

     public static void main (String[] args) {

         char[] x =  {'t', 'Z', 's', 'M', '8', 'j', 'Y', '3'};

           for (char next : x) {

             System.out.println(next);

           }

           Arrays.sort(x);

           System.out.println("~~~~~~~~~~~~~~~~");

            for (char next : x) {

             System.out.println(next);


           }
     }
}