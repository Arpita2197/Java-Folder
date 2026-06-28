class Z {

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

class K extends Z  {

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

           K x = new K();

        //  Z x = new Z();  parent ko child ka nhe pata hota.....



           System.out.println("end");
      }



}