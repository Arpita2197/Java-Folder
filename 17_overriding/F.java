class X1 {

    final void pro() {        // final ham isliya maark karta hai kyuki jisma ham usma koi change na kar saka....toh yeah override nhe ho sakti


    }
}

class F extends X1 {

    void pro() {

    }

   
}

// C:\Users\lenovo\OneDrive\Desktop\java\17_overriding>javac F.java
// F.java:11: error: pro() in F cannot override pro() in X1
//     void pro() {
//          ^
//   overridden method is final
// 1 error
