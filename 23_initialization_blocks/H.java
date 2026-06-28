class H {

     static int y = 1;

      static void pro() {

         
      }

        // static - anynomous code , jab class load hogi tab hee load ho jayaga,,==>  aur ek baar bss print hoga...
        // main method static load hona ka bhout baad ayagi...

       static {
         
           System.out.println("AAA");
       }

        public static void main(String[] args) {
             
              
           System.out.println("Start");

           H a = new H();    // static bss ek baar print/ load hoga .........
           H b = new H();
           H c = new H();

             System.out.println("end");

        }
}