class F1 {

     F1() {

   // super call
      
      // magic code= instance var memory allocate, instance method register , anymous code block run...then constructor code will run...
         System.out.println("XYZ");
            System.out.println("A");
     }

      F1(int x) {
     
         System.out.println("XYZ");
            System.out.println("P");

      }

       F1(int y , int x) {

            System.out.println("XYZ");
              System.out.println("Y");
       }

        public static void main(String[] args) {

             F1 x = new F1();
                F1 y = new F1(1);
                   F1 z = new F1(1,2);
        }
}