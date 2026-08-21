class B {

   static void pro(int a , int b) {

      System.out.println("HI");

   }

    public static void main(String[] args) {

          // pro(15,29);

          pro(25);

          pro(23,24,25);
    }
}

//  B.java:13: error: method pro in class B cannot be applied to given types;
//           pro(25);
//           ^
//   required: int,int
//   found:    int
//   reason: actual and formal argument lists differ in length
// 1 error


//  B.java:15: error: method pro in class B cannot be applied to given types;
//           pro(23,24,25);
//           ^
//   required: int,int
//   found:    int,int,int
//   reason: actual and formal argument lists differ in length
// 2 errors