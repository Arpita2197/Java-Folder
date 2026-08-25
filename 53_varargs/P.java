class P {

    static void pro(String nm1,String nm2,int...marks) {
         
        System.out.println(nm1);
         System.out.println(nm2);

          System.out.println("!!!!!!!!!!!!!!!!!!");

           for( int nx : marks)
            System.out.println(nx);
    }

      public static void main(String[] args) {

           pro("om","ram",12,15);
      }
}