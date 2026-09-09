@interface kk {

    int x = 3;
    String y = "om";
}

@kk(x=33,y="sonu") 
class Q {

}

// Q.java:7: error: cannot find symbol
// @kk(x=33,y="sonu")
//     ^
//   symbol:   method x()
//   location: @interface kk
// Q.java:7: error: cannot find symbol
// @kk(x=33,y="sonu")
//          ^
//   symbol:   method y()
//   location: @interface kk
// 2 errors
