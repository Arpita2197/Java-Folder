

       // Cyclic Inheritance......

class K extends T1 {


}

class T1 extends K {


}

//  K.java:5: error: cyclic inheritance involving K
// class K extends T1 {
// ^
// 1 error