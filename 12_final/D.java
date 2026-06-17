class X4 {

    final void pro() {

          System.out.println("Hello jiii");

      }
}

     // access through inheritance
     
class D extends X4 {

      public static void main(String[] args) {

          // D a = new D();          // okay

             X4 b = new X4();            //okay

            b.pro();            // final keyword wala ko as it is call kar sakta
                                   // bss modified nhe kar sakta...
      }
}