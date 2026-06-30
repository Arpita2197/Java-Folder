class P {
     
     public static void main(String[] args) {

         String[] x ;

          x =  {"chotaBheem", "chutki","kaliya","dholu","TunTun-masi"};

          System.out.println(x.length);

           System.out.println("========");

            for(int i=0;i<x.length;i++) {

                 System.out.println(x[i]);
            }

     }
}


//  P.java:7: error: illegal start of expression
//           x =  {"chotaBheem", "chutki","kaliya","dholu","TunTun-masi"};
//                ^
// P.java:7: error: not a statement
//           x =  {"chotaBheem", "chutki","kaliya","dholu","TunTun-masi"};
//                 ^
// P.java:7: error: ';' expected
//           x =  {"chotaBheem", "chutki","kaliya","dholu","TunTun-masi"};
//                             ^
// 3 errors