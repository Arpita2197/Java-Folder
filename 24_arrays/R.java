class R {
     
     public static void main(String[] args) {

         String[] x = {"chotaBheem", "chutki","kaliya","dholu","TunTun-masi"};
        
          System.out.println(x.length);

           System.out.println("========");

            // for(int i=0;i<x.length;i++) {

            //      System.out.println(x[i]);
            // }

             // ENCHANCED FOR LOOP>>>>>(FOR EACH LOOP)...

              for( String next : x ) {

                 System.out.println(next  + "^");
              }
     }
}