class ZA {

     ZA() {

         System.out.println("M");
     }
}

class ZB extends ZA {

     
     ZB() {
                 
           int y = 2/0;      
         System.out.println("N");
     }
}

class ZC extends ZB {
    
     ZC() {

         System.out.println("O");
     }
}

class N {

     public static void main(String[] args) {

         System.out.println("A");

          ZC x = new ZC();

           System.out.println("S");


     }
}

// A
// M
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at ZB.<init>(N.java:14)
//         at ZC.<init>(N.java:21)
//         at N.main(N.java:33)
