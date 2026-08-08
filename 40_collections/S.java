import java.util.Arrays;

class S {

     public static void main (String[] args) {

         int [] x = {10,40,20,4,99,25};

         for(int next : x) {

             System.out.println(next);

         }

          Arrays.sort(x);

           System.out.println("~~~~~~~~~~~~~~~~");

             for(int next : x) {

             System.out.println(next);

         }


     }
}