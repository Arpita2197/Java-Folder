class B {

     int y=99;

      public static void main (String[] args) {

         System.out.println(y);

      }
}

class B1 {

     int y =999;
}

   // error=B.java:7: error: non-static variable y cannot be referenced from a static context
    //     System.out.println(y);
    //                        ^