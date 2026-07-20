class G {

     public static void main(String[] args) {

        System.out.println("Start");

         int[] x = {12,13,14};
        
           try {

                System.out.println(x[3]);
           }

             catch(ArrayIndexOutOfBoundsException b) {

                      System.out.println("problem");
             }
        

           System.out.println("End");

     } 
}