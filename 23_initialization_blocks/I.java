class I {

     static{

         System.out.println("B");
     }

      public static void main(String[] args) {
             
              
           System.out.println("Start");

           I a = new I();    // static bss ek baar print/ load H1oga .........
           I b = new I();
           I c = new I();

             System.out.println("end");

        }

         static {

         System.out.println("E");
     }

      static{

         System.out.println("S");
     }

      static{

         System.out.println("T");
     }



      
}