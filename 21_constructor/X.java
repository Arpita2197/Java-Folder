class X {

    X() {

         this(12);
    }

    X(int a) {
     
       this();
         
    }
}

//  X.java:3: error: recursive constructor invocation
//     X() {
//     ^
// 1 error
