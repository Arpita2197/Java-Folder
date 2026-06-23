class A1 {

     public static void main(String[] args) {

         bathua a = new bathua();

         // preparebathuaVegetable(a);

          prepareLeafyVegetable(a);

         cholai b = new cholai();

         // preparecholaiVegetable(b);

          prepareLeafyVegetable (b);

         norpa  c = new norpa();

         // preparenorpaVegetable(c);

          prepareLeafyVegetable(c);

     }

      
    // static void preparebathuaVegetable(bathua a) {
         static void prepareLeafyVegetable(bathua a) {

        System.out.println("~~~~ Prepare Bathua ~~~~~~~");
        System.out.println("----- step 1");
        System.out.println("----- step 4");
        System.out.println("----- step 7");
        System.out.println("----- step 9");
    }


        //static void preparenorpaVegetable(norpa c) {

         static void prepareLeafyVegetable(norpa c) {
   
        System.out.println("~~~~ Prepare Norpa ~~~~~~~");
        System.out.println("----- step 2");
        System.out.println("----- step 3");
        System.out.println("----- step 5");
        System.out.println("----- step 7");
        System.out.println("----- step 9");
    }

     // static void preparecholaiVegetable(cholai b) {
         static void prepareLeafyVegetable(cholai b) {

        System.out.println("~~~~ Prepare Cholai ~~~~~~~");
        System.out.println("----- step 1");
        System.out.println("----- step 3");
        System.out.println("----- step 5");
        System.out.println("----- step 6");
        System.out.println("----- step 8");
        System.out.println("----- step 9");
    }
}