class F {

     public static void main(String[] args) {

        System.out.println("Start");

         String x = null;

           try {

              System.out.println(x.length());
           }
             catch(NullPointerException a) {

                   System.out.println("problem");
             }
        
           System.out.println("End");

     } 
}


