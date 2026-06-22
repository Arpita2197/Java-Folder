class X1 {

    float pro() {
  
     return 15.29f;

    }
}

class H1 extends X1 {

    double pro() {

          return 15.0;
    }

} 

//  H1.java:12: error: pro() in H1 cannot override pro() in X1
//     double pro() {
//            ^
//   return type double is not compatible with float
// 1 error

