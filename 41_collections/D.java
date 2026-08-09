import java.util.Arrays;
import java.util.List;

class D {

     public static void main(String[] args) {

         int [] x = {15,29,6};

         List <int[]> list = Arrays.asList(x);

         for(int[]  next : list) {
             
             for(int nx : next) {

                 System.out.println(nx);
             }
         }

          x[2]=22;

           System.out.println("!!!!!!!!!!!!");

             for(int[] next : list) {
             
             for(int  nx : next) {

                 System.out.println(nx + "~");
             }
         }

          
     }
}