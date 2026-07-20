class T {

    static int count =0;

    public static void main(String[] args) {

         System.out.println("A");

         try {

            pro();  // error ayaggaa toh throwable catch kar lega..

         } catch(Throwable e) {
            System.out.println(e);
         } finally {
             System.out.println("Essential code");      
       }

          System.out.println("Z");
    }

     static void pro() {

           System.out.println(count++);
           pro();
     }
}