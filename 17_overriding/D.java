class X1 {

    static void pro() {


    }
}

class D extends X1 {

    void pro() {


    }
}

//  D.java:11: error: pro() in D cannot override pro() in X1
//     void pro() {
//          ^
//   overridden method is static
// 1 error
