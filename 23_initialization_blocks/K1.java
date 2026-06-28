class Z1 {

      {

         System.out.println("A");
     }

        static {

         System.out.println("B");
     }

      {

         System.out.println("C");
     }

      static {

         System.out.println("D");
     }

}

class K1  {

     static {

         System.out.println("E");
     }

           {

         System.out.println("F");
     }

      static {

         System.out.println("G");
     }

       {

         System.out.println("H");
     }

      public static void main(String[] args) {
         
          System.out.println("start");

           Z1 x = new Z1();

           System.out.println("end");
      }



}