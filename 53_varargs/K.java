class K {

    static void pro(String x , int...y) {
         
         System.out.println(x);
          System.out.println(y.length);

           for( int next : y) {

              System.out.print(next);
           }
       
    }

      public static void main(String[] args) {

            byte a = 10;
            short s = 12;
            char c = 65;

            pro("om",a,s,c);

      }
}