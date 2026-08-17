class D {

     int x = 99;

      void pro() {

         System.out.println("Hello!!!!!!!!!!");

      }

       class A {      // instance level member class of D...

         
       }

        public static void main(String[] args) {

            // System.out.println(x);

            // pro();

             new A();      // instance level  member class...
        }
}

//  D.java:22: error: non-static variable this (new A()) cannot be referenced from a static context
//              new A();
//              ^
// 1 error
