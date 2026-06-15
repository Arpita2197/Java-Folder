package x.y;
import a.b.c.A;

class B extends A {

     public static void main(String[] args) {

           A a = new A();                  // not ok
                                           // agar different packages ma hai toh apko child ka hee object bananana hoga....

            System.out.println(a.x);
     }
}

 // x\y\B.java:10: error: x has protected access in A
//             System.out.println(a.x);
//                                 ^
// 1 error
