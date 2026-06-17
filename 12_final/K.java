class K {

      static final int w ;

       K() {
                            // K() kisi x obj ref ma jayaga toh obj rf instance contex banata hai,
                             // toh tab bhi ham instance contex ma ststic var ko call kar sakta but final honi ki baja sa woh unfodiable ha..
                             // kyuki jab class bani woh tab hee w class ma load ho gaya,aur constructor baad ma call hoga..
           w=11;
       }
}

//   K.java:7: error: cannot assign a value to final variable w
//            w=11;
//            ^
// 1 error