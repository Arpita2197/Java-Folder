class AA {


}

class W extends AA {

     W() {

         super(1);
     }
}

// W.java:10: error: constructor AA in class AA cannot be applied to given types;
//          super(1);
//          ^
//   required: no arguments
//   found:    int
//   reason: actual and formal argument lists differ in length
// 1 error
