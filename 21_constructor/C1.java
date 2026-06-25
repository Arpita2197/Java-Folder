class C1 {

    C1 (int y) {

       System.out.println("namaste");

    }

         public static void main(String[] args) {

              //C1 x = new C1(15);

               C1 b = new C1();               // agar hamna constructor banaya ha toh compiler nhe banayaga default constructor...
     
            System.out.println(b);

         } 

     
}

//  C1.java:13: error: constructor C1 in class C1 cannot be applied to given types;
//                C1 b = new C1();
//                       ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error