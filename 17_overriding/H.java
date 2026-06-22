class X1 {

    double pro() {
  
     return 15.29;

    }
}

class H extends X1 {

    float pro() {

          return 15.0f;
    }

} 

//  C:\Users\lenovo\OneDrive\Desktop\java\17_overriding>javac H.java
// H.java:12: error: pro() in H cannot override pro() in X1
//     float pro() {
//           ^
//   return type float is not compatible with double
// 1 error
