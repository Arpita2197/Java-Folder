class H2 {

   public static void main(String[] args) {

      Animal [] x  = new dog[2];

       x[0] = new dog();

        x[1] = new cat();
   }
     
}

//  Exception in thread "main" java.lang.ArrayStoreException: cat
//         at H2.main(H2.java:9)
