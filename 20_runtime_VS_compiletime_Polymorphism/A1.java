class A1 {

    // Compile-time polymorphism

    //Legal Case of method overloading
    
        
     static void pro(char a) {

         System.out.println(a + "--------char");

     }

       static void pro(int a) {

         System.out.println(a + "--------int");
         
     }

       static void pro(float a) {

         System.out.println(a + "--------float");
         
     }

      public static void main(String[] args) {

          pro(44);
           pro('A');
            pro(15.29f);
            pro(11.0);
      }
}


//  A1.java:31: error: no suitable method found for pro(double)
//             pro(11.0);
//             ^
//     method A1.pro(char) is not applicable
//       (argument mismatch; possible lossy conversion from double to char)
//     method A1.pro(int) is not applicable
//       (argument mismatch; possible lossy conversion from double to int)
//     method A1.pro(float) is not applicable
//       (argument mismatch; possible lossy conversion from double to float)
// 1 error