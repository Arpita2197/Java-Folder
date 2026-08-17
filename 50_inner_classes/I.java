class I {

     class A {

         int w =222;

          void pro() {

             System.out.println("HLOOOOOOO");

          }
     }

      public static void main(String[] args) {

         I i = new I();

         A a =  i.new A();

          System.out.println(i.w); // inner class ka members ko inner class ka obj sa hee call kar sakta hai........
          i.pro();
      }
}

//  I.java:20: error: cannot find symbol
//           System.out.println(i.w);
//                               ^
//   symbol:   variable w
//   location: variable i of type I
// I.java:21: error: cannot find symbol
//           i.pro();
//            ^
//   symbol:   method pro()
//   location: variable i of type I
// 2 errors
