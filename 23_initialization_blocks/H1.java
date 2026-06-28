class H1 {

     static int y = 1;

      static void pro() {

         
      }

        // static - anynomous code , jab class load H1ogi tab H1ee load H1o jayaga,,==>  aur ek baar bss print H1oga...
        // main metH1od static load H1ona ka bH1out baad ayagi...

    //    static {
         
    //        System.out.println("AAA");
    //    }

        public static void main(String[] args) {
             
              
           System.out.println("Start");

           H1 a = new H1();    // static bss ek baar print/ load H1oga .........
           H1 b = new H1();
           H1 c = new H1();

             System.out.println("end");

        }

            static {
         
           System.out.println("BBB");
       }


      
}