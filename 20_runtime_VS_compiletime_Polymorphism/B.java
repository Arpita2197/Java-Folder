class A {

     void pro() {

         System.out.println("Hi11");
     }
}


class A1 extends A {

       void pro() {

         System.out.println("Hello");
     }
}

class A2 extends A {

       void pro() {

         System.out.println("namastee");
     }
}                         //  DYNAMIC METHOD DISPATCH == RUNTIME POLY...

class B {

     public static void main(String[] args) {

         A x = new A1();

          x.pro();

           x = new A2();

            x.pro();
     }
}