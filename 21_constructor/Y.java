class Y1 {

    Y1(int x) {


    }
}

class Y extends Y1 {

     int a = 11;         // instance level super() call ka baad frame ma ayata hai....

     Y() { 

         super(a);

     }
}

// Y.java:15: error: cannot reference a before supertype constructor has been called
//          super(a);
//                ^
// 1 error
