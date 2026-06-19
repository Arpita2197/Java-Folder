 interface X {

     int w=143;

 }

 class L1 implements X {

      public static void main(String[] args) {

         System.out.println(X.w);
           
            X.w =222;           // interface variables are implicitly final.....
      }
 }

//    L1.java:13: error: cannot assign a value to final variable w
//             X.w =222;
//              ^
// 1 error
