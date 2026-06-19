interface Z2 {
     
      void pro();

}


abstract class N2 implements Z2 {

     void pro() {


     }

}


// N2.java:10: error: pro() in N2 cannot implement pro() in Z2
//      void pro() {
//           ^
//   attempting to assign weaker access privileges; was public
// 1 error
// PS C:\Users