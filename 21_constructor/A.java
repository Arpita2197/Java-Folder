class A {

     static int y = 15;

      static void pro() {

         System.out.println("hello");

      }


          public static void main(String[] args) {

              System.out.println(y);

              pro();

               info();

                System.out.println(t);

          }
      
}

//  A.java:18: error: cannot find symbol
//                info();
//                ^
//   symbol:   method info()
//   location: class A
// A.java:20: error: cannot find symbol
//                 System.out.println(t);
//                                    ^
//   symbol:   variable t
//   location: class A
// 2 errors