package x.y;

import a.b.c.A;

class C {

     public static void main(String[] args) {

    
         B a = new B();

          System.out.println(a.x);
          
     }
}

//    x\y\C.java:12: error: x has protected access in A
//           System.out.println(a.x);
//                               ^
// 1 error

 
   // protected sirf inheritance ka through aa sakta hai