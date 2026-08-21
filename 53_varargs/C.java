class C {

   static void pro(int x) {

      System.out.println("HI");

   }

    public static void main(String[] args) {

           pro();

      
    }
}

// C.java:11: error: method pro in class C cannot be applied to given types;
//            pro();
//            ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
