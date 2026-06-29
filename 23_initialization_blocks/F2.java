class F2 {
 
     //  anynomous block ko constructor ka bahar likhta ha kyuki code redundancy reduce karna ka liya..

      // instance level anynomus block harr constructor ma call hoga.....
     {
         System.out.println("XYZ");
     }

     F2() {

           // System.out.println("XYZ");
            System.out.println("A");
     }

      F2(int x) {
     
         //System.out.println("XYZ");
            System.out.println("P");

      }

       F2(int y , int x) {

          //  System.out.println("XYZ");
              System.out.println("Y");
       }

        public static void main(String[] args) {

             F2 x = new F2();
                F2 y = new F2(1);
                   F2 z = new F2(1,2);
        }
}