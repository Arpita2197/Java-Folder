class X1 {

    void pro() {

    }
}

class C extends X1 {

   static void pro() {


     }
}

// C.java:10: error: pro() in C cannot override pro() in X1
//    static void pro() {
//                ^
//   overriding method is static
// 1 error
