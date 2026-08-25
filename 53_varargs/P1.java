class P1 {

    static void pro(String[] names,int...marks) {
         
          for ( String next : names) {

            System.out.println(next);

          }

          System.out.println("!!!!!!!!!!!!!!!!!!");

           for( int nx : marks)
            System.out.println(nx);
    }

      public static void main(String[] args) {

         //  pro("om","ram",12,15);     NOT OK
         //   pro({"om","ram"},12,15);  NOT OK

          pro(new String[] {"om","ram","golu"},1,2,3);
      }
}