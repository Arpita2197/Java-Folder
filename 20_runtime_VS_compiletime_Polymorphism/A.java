class A {

    // Compile-time polymorphism

    //Legal Case of method overloading......
    
        
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
      }
}