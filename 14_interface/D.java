interface X {

     void pro();             // implicitly marked as abstract
}


class D {

    /*abstract*/  void info();      
           // explicitly marked as abstract
}


//  D.java:9: error: missing method body, or declare abstract
//     /*abstract*/  void info();             // explicitly marked as abstract
//                        ^
// 1 error