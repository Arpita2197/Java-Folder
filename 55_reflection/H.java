enum CoffeeMugSize {

     SMALL,MEDIUM,LARGE
             
  }

  class H {

    
     public static void main(String[] args) {

           Class<CoffeeMugSize> klass = CoffeeMugSize.class;

        CoffeeMugSize[] kl = klass.getEnumConstants();

           for (CoffeeMugSize next : kl) {

             System.out.println(next);
           }

      }    
  }