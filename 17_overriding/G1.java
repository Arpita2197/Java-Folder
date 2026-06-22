class X1 {

    int pro() {
  
     return 0;

    }
}

class G1 extends X1 {

    void pro() {


    }

} 

//  G1.java:12: error: pro() in G1 cannot override pro() in X1
//     void pro() {
//          ^
//   return type void is not compatible with int
// 1 error

