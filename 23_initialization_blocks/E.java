class X1 {

     {
         System.out.println("A");
     }

      X1() {
           
            System.out.println("B");
      }
}

  class E extends X1 {

     {
         System.out.println("C");
     }

      E() {
           
            System.out.println("D");
      }

       public static void main(String[] args) {
         
          System.out.println("Hello");

            E x = new E();            // child ka bana raha ha , matlab parent apna aap call hoga phela......

             System.out.println("BYE");
       }

      
  }