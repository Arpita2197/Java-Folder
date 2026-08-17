class I1 {

     class A {

         int w =222;

          void pro() {

             System.out.println("HLOOOOOOO");

          }
     }

      public static void main(String[] args) {

         I1 i = new I1();

         A a =  i.new A();

          System.out.println(a.w); // inner class ka members ko inner class ka obj sa hee call kar sakta hai........
          a.pro();
      }
}