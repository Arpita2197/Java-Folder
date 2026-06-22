interface Z {

    void pro();        // interface by default public abstract hota hai..
}

  // OKAY........
// class P implements Z {

//      public void pro() {


//      }
// }

 class P implements Z {

      void pro() {

        
     }
}

// P.java:17: error: pro() in P cannot implement pro() in Z
//       void pro() {
//            ^
//   attempting to assign weaker access privileges; was public
// 1 error
