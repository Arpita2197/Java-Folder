class E {

   static void pro(int[] x) {

      System.out.println("HI");

   }

    public static void main(String[] args) {

          // pro(12);
            
            pro(12,13,14,15);
      
    }
}


//  E.java:13: error: method pro in class E cannot be applied to given types;
//             pro(12,13,14,15);
//             ^
//   required: int[]
//   found:    int,int,int,int
//   reason: actual and formal argument lists differ in length
// 1 error
