class X {
     
      {
         System.out.println("H");
      }


       X() {

          System.out.println("H--");
           System.out.println("I");
       }
}

class F extends X {

     {
         System.out.println("B");
     }

     F() {
    
       System.out.println("B--");
        System.out.println("y");
         
     }

      public static void  main(String[] args) {

         System.out.println("start");

         //  X y = new X();     // kyuki parent ko child ka nhe pata hota ha...
           F y = new F();

            System.out.println("end");

           
      }
}