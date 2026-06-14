package x.y;

import a.b.c.A;

class D {

     public static void main(String[] args) {

         A a = new A();    ?? HAS - A
          
          a.pro();
     }
}


// x\y\D.java:11: error: pro() has protected access in A
//           a.pro();
//            ^
// 1 error
