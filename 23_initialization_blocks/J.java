class J {

       // static code ha toh class load hota hee woh print ho jayaga

        // phir main method wala code run hoga

         // usma constructor call ha
         // constructor ka super call run hoga
         // super call ka bad , instance level var , method ayaga/...
         // phir anymous code run hoga
         // phir constructor ka code run hoga....
      {
         System.out.println("P");
     }

     static {

         System.out.println("A");
     }

      {

         System.out.println("M");
     }

      static{

         System.out.println("MM");
     }

      public static void main(String[] args) {

        System.out.println("main-start");

         J x = new J();

         System.out.println("main-end");
      }



}