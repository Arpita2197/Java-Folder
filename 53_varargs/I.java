class I {

    static void pro(String x , int...y) {
         
         System.out.println("HIIIIIIIIIII");

    }

      public static void main(String[] args) {

           pro();
      }
}

//  I.java:11: error: method pro in class I cannot be applied to given types;
//            pro();
//            ^
//   required: String,int[]
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error