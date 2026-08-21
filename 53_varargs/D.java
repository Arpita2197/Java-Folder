class D {

   static void pro(int x , int y) {

      System.out.println("HI");

   }

    public static void main(String[] args) {

         int[] arr = {15,29};

         D.pro(arr);
    }

}

//  D.java:13: error: method pro in class D cannot be applied to given types;
//          D.pro(arr);
//           ^
//   required: int,int
//   found:    int[]
//   reason: actual and formal argument lists differ in length
// 1 error

