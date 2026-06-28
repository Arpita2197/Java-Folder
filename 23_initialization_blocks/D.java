class D {

     {
        // instance level
          System.out.println("NAMASKARRRR");

     }

        D () {
 
                   // super call=>

    // then,instance variables ko memory allocate hogi, instance method register hoga, then anonymous code run hoga, then constructor ka user wala code run hoga
                   
             System.out.println("HII");

        }

      public static void main(String[] args) {
         
          System.out.println("main-start");
   
           D X = new D();

           System.out.println("main-end");
           
      }
}