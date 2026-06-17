/*final*/ class X3 {

    final void pro() {             // final ==> complete and unmodifable..

         //----
     }

       void info() {

           //------
       }
}


class C extends X3 {

    void aa () {

         //----
    }

      void pro() {

          //--------            // you cant modifeid it when it have final keyword....
      }

       void info() {

          //-------------
       }

      
}

//          C.java:22: error: pro() in C cannot override pro() in X3
//       void pro() {
//            ^
//   overridden method is final
// 1 error