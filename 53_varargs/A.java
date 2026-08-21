class A {

   static void pro() {

      System.out.println("HI");

   }

    public static void main(String[] args) {

          // pro();

          pro(25);
    }
}

//  A.java:13: error: method pro in class A cannot be applied to given types;
//           pro(25);
//           ^
//   required: no arguments
//   found:    int
//   reason: actual and formal argument lists differ in length
// 1 error
