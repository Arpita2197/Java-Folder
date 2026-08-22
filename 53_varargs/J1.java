class J1 {

    static void pro(String x , int...y) {
         
         System.out.println(x);
          System.out.println(y.length);

           for( int next : y) {

              System.out.print(next);
           }
       
    }

      public static void main(String[] args) {

           pro("om",12,3,4,5,6);
      }
}