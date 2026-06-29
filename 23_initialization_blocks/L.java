class AA {

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
            int y = 12/0;
     }
}

class L extends AA {

     {
       System.out.println("E");
     }

     static {
        System.out.println("F");
     }

     {
        System.out.println("G");
     }

     static {
           System.out.println("H");
     }

      public static void main(String[] args) {

         System.out.println("main start");

          L x = new L();
          System.out.println("main end");
      }
}